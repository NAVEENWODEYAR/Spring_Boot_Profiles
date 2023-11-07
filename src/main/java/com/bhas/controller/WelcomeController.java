package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController 
{
	@GetMapping("/welcome")
	public String wishMsg()
	{
		return "Good Morning,";
	}
}