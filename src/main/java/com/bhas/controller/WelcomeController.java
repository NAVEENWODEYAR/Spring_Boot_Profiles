package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/welcome")
@Slf4j
public class WelcomeController 
{
	@GetMapping("/sp")
	public String wishMsg()
	{
		log.info("@Slf4j");
		return "Good Morning,";
	}
}
