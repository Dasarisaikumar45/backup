package com.ibm.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello Spring Boot";
	}
	
	@PostMapping(value = "/hello")
	public String sayPostHello() {
		return "POST: Hello Spring Boot";
	}
	@PutMapping(value = "/hello")
	public String sayPutHello() {
		return "PUT: Hello Spring Boot";
	}
	@DeleteMapping(value = "/hello")
	public String sayDeletetHello() {
		return "DELETE: Hello Spring Boot";
	}

}