package com.bank.service;

import java.util.List;

import com.bank.model.Account;

public interface HomeService {

	public void saveAccount(Account a);

	public Account findByUsernameAndPassword(String username,String password);
	
	public List<Account> findall();
	
	public Account findByAccno(int accno);
	
	public void delAccount(Account a);
}
