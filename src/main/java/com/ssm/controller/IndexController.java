package com.ssm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuchen
 * @date 2018/9/21
 */

@Slf4j
@RequestMapping("/index")
@RestController
public class IndexController {


	@GetMapping(path="/simple/revisited", headers="Accept=text/plain")
	public String simple() {
		return "Hello world revisited!";
	}
}
