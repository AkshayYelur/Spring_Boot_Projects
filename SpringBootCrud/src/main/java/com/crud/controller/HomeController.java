package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.model.employee;
import com.crud.service.HomeService;

import jakarta.persistence.Id;

@Controller
public class HomeController {

	@Autowired
	HomeService h;
	
	@GetMapping("/")
	public String prelogin() {
		return "login";
	}
	
	@GetMapping("/newuser")
	public String preReg() {
		
		return "register";
	}
	
	@GetMapping("/reg")
	public String regData(@ModelAttribute employee e) {
		h.saveData(e);
		return "login";
	}
	
	@GetMapping("/login")
	public String loginCheck(@RequestParam("username") String us,@RequestParam("password") String ps,Model m) {
		
		
		//employee e = h.loginCheck(us,ps);
		
		//System.out.println(e.getName());
		
		Iterable<employee> list=h.getAllData();
		m.addAttribute("data",list);
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
