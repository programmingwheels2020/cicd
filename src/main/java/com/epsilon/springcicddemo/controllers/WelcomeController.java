package com.epsilon.springcicddemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.springcicddemo.services.WelcomeService;

@RestController
public class WelcomeController {
	
	private WelcomeService welcomeService;

	@GetMapping(path = "/welcome")
	public String welcome() {
		return this.welcomeService.welcome();
	}
}
