package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
	@GetMapping("/name")
public String getName() {
		String studentName="IamNeo";
	return "Welcome "+studentName+"!";
}
}
