package com.ng.hrms.db.api.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@Value("${spring.application.name}")
	String serviceName;
	@Value("${server.port}")
	String servicePort;
	
	@GetMapping
	public String hellow() {
		return "I am "+serviceName+" Running on port : "+servicePort;
	}	

}
