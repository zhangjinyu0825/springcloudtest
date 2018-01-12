package com.cml.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cml.springcloud.service.HelloRemoteHystrix;

@FeignClient(name="spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name")String name);
}
