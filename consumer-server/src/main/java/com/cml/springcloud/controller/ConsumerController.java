package com.cml.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cml.springcloud.feign.HelloRemote;

@RestController
public class ConsumerController {
	@Autowired
	private HelloRemote helloRemote;
	
	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return helloRemote.hello(name);
	}
}
