package com.cml.springcloud.service;

import org.springframework.stereotype.Component;

import com.cml.springcloud.feign.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello(String name) {
		 return "hello " + name + ", this messge send failed ";
	}

}
