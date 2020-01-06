package com.ssm.controller;

/**
 * @author liuchen
 * @date 2019/12/30
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RestController
public class EndpointDocController {

	@Autowired
	@Qualifier("requestMappingHandlerMapping")
	private RequestMappingHandlerMapping requestMappingHandlerMapping;

//	@Autowired
//	public EndpointDocController(RequestMappingHandlerMapping handlerMapping) {
//		this.handlerMapping = handlerMapping;
//	}

	@ResponseBody
	@RequestMapping(value="/endpointdoc", method=RequestMethod.GET)
	public ResponseEntity show() {
		Map<RequestMappingInfo, HandlerMethod> handlerMethods =  this.requestMappingHandlerMapping.getHandlerMethods();
		Map<String, Set<String>> urlMap = new HashMap<>();
		Set<String> urlPath = new HashSet<>();
		Set<String> activityUrlPath = new HashSet<>();
		String urlString = "a/b/c,c/b/d/";

		String[] urlArray = urlString.split(",");
		List<String> highRateUrl = Arrays.stream(urlArray).map(url -> url.trim()).collect(Collectors.toList());

		for(Entry<RequestMappingInfo, HandlerMethod> item : handlerMethods.entrySet()) {
			RequestMappingInfo mapping = item.getKey();
			HandlerMethod method = item.getValue();

			for (String urlPattern : mapping.getPatternsCondition().getPatterns()) {
				System.out.println(
						method.getBeanType().getName() + "#" + method.getMethod().getName() +
								" <-- " + urlPattern);

				if (urlPattern.contains("activity") || urlPattern.contains("invite")) {
					activityUrlPath.add(urlPattern);
				} else if (!highRateUrl.contains(urlPattern)){
					urlPath.add(urlPattern);
				}
			}
		}

		urlMap.put("activity", activityUrlPath);
		urlMap.put("api", urlPath);
		return ResponseEntity.ok(urlMap);
	}
}