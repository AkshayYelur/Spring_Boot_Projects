package com.cjc.day2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	
	@RequestMapping("/")
	public String homePage() {
		return "login";
		
	}
	@RequestMapping("/reg")
	public String regggg()
	{
		return "register";
	}
	
	@RequestMapping("/regs")
	public String result(@ModelAttribute Student s) {
		System.out.println(s);
		return "success";
	}
}
