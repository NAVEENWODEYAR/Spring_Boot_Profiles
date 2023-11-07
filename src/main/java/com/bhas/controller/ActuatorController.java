package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ActuatorController 
{
	@GetMapping("/wish")
	public String wishMsg()
	{
		return "Welcome to the Spring-Profile Application";
	}
}
