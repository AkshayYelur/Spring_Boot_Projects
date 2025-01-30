package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.Account;
import com.bank.service.HomeService;

public interface HomeRepository extends JpaRepository<Account, Integer> {
	
	public Account findByUsernameAndPassword(String username,String password);

	public Account findByAccno(int accno);
	
	

}
