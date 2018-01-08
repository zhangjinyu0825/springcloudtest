package com.cml.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	
	@Value("${foo}")
	private String foo;
	
	@RequestMapping("/hi")
	public String hi() {
		System.out.println("foo的值是：" + foo);
		return "foo的值是：" + foo;
	}
}
