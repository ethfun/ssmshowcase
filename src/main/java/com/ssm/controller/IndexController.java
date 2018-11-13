package com.ssm.controller;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuchen
 * @date 2018/9/21
 */

@Slf4j
@RequestMapping("/index")
@RestController
public class IndexController {

	@GetMapping(path="/home" )
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity home() {
		Map<String ,String> map = new HashMap<>();
		map.put("tag", "Hello world, ssm!");
		return ResponseEntity.ok(map) ;
	}

	@GetMapping(path="/simple", headers="Accept=text/plain")
	public String simple() {
		return "Hello world revisited!";
	}
}
