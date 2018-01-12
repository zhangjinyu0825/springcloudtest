package com.cml.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProducerApplication.class, args);
	}
}