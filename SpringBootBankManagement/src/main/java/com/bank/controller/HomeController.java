package com.bank.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.model.Account;
import com.bank.service.HomeService;

@Controller
public class HomeController {
	
	List<Account> al = new ArrayList<Account>();
	
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String homePage() {
		
		return "login";
	}
	
	@RequestMapping("/newuser")
	public String newUser() {
		
		return "register";
		
	}
	
	@RequestMapping("/reg")
	public String regdata(@ModelAttribute Account a) {
		hs.saveAccount(a);
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Model m,@RequestParam("username") String us,@RequestParam("password") String ps) {
	//	hs.saveAccount(a);
		
		List<Account> al = hs.findall();
		Account a = hs.findByUsernameAndPassword(us, ps);
		System.out.println(us+ " - " +ps);
			if(us.equals(a.getUsername())&&ps.equals(a.getPassword())) {
				
				m.addAttribute("data",a);
				return "success";
			}
		
	
		return "login";
	}
	
	@RequestMapping("/deposite")
	public String depositePage(@RequestParam("accno") int accno,Model m) {
		Account a = hs.findByAccno(accno);
		m.addAttribute("data",a);
		
		return "deposite";
	}

	
	@RequestMapping("/depositmoney")
	public String depositetoLogin(@RequestParam("balance") long b,@RequestParam("accno") int accno) {
		Account a = hs.findByAccno(accno);
		long bal= b+a.getBalance();
		a.setBalance(bal);
		hs.saveAccount(a);
		return "login";
	}
	
	@RequestMapping("/withdrawal")
	public String withdrawPage(@RequestParam("accno") int accno,Model m) {
		Account a = hs.findByAccno(accno);
		m.addAttribute("data",a);
		
		return "withdrawal";
	}
	
	@RequestMapping("/withdrawalmoney")
	public String withdrawaltoLogin(@RequestParam("balance") long b,@RequestParam("accno") int accno) {
		Account a = hs.findByAccno(accno);
		long bal= a.getBalance()-b;
		a.setBalance(bal);
		hs.saveAccount(a);
		return "login";
	}

	@RequestMapping("/update")
	public String updateData(@RequestParam("accno") int accno,Model m) {
		Account a = hs.findByAccno(accno);
		m.addAttribute("data",a);
		return "update";
	}
	
	@RequestMapping("/updatetologin")
	public String updtaetoLogin(@ModelAttribute Account a,@RequestParam("accno") int an) {
		if(an==a.getAccno()) {
		
		
		hs.saveAccount(a);
		return "login";
		}
		else {
			return "update";
		}
	}
	
	
//	@RequestMapping("/delete")
//	public String deleteData(@RequestParam("accno") int accno,Model m) {
//		Account a = hs.findByAccno(accno);
//		m.addAttribute("data",a);
//		return "delete";
//	}

	
	@RequestMapping("/delete")
	public String deletotoLogin(@RequestParam("accno") int an) {
		
	Account a=hs.findByAccno(an);
		hs.delAccount(a);
		return "login";
	
		
	
	
	
	
	
	}
}
