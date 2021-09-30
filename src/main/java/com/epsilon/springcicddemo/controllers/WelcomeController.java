package com.epsilon.springcicddemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Welcome to ooty , nice to meet you";
	}
}
