package com.wp.one.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${owner}")
	private String name;
	
	@RequestMapping("/")
    String index() {
    	
        return "Welcome to know Spring Boot ! <br/>"+name;
    }
}
