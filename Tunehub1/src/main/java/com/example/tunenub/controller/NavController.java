package com.example.tunenub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/login")
	public String login() {
		return "login";
		}
	@GetMapping("/Registration")
	public String Registration() {
		return "Registration";
	}
	
	@GetMapping("/newsong")
	public String newsong() {
		return "newsong";
	}
	
	
	
}
