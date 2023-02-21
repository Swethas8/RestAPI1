package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	@Value("${greetings.message}")
	private String welcome;
	@GetMapping("/welcome")
    public String welcome() {
    	return welcome;
    }
}
