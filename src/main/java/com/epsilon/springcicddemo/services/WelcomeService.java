package com.epsilon.springcicddemo.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String welcome() {
		return "Welcome to Ooty, nice to meet you";
	}

}
