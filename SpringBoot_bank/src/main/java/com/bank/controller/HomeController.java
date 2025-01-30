package com.bank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.model.Account;


@Controller
public class HomeController {
	
	List<Account> al = new ArrayList<Account>();
	
	
	@RequestMapping("/")
	public String loginPage() {
		
		
		return "login";
	}
	
	@RequestMapping("/newuser")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String registertologinPage(@ModelAttribute Account a) {
		al.add(a);
		return "login";
	}
	
	@RequestMapping("/login")
	public String logintowsucess(@RequestParam("username") String us,@RequestParam("password") String ps,Model m) {
		if(us.equals("admin")&& ps.equals("admin")) {
			m.addAttribute("data",al);
			return "success";
		}
		return "login";
			
		}
		
		
	
	
	
	
	
}
