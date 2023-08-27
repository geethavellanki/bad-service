package com.bad.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bad")
public class BadController {
	
	@GetMapping("/bad")
	public String bad() {
		return "service is not good";
	}

}
