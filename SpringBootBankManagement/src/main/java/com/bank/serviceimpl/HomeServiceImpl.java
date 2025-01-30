package com.bank.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Account;
import com.bank.repository.HomeRepository;
import com.bank.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	HomeRepository impl;

	@Override
	public void saveAccount(Account a) {
		// TODO Auto-generated method stub
	impl.save(a);	
	}

	@Override
	public Account findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		
		return impl.findByUsernameAndPassword(username, password);
	}

	@Override
	public List<Account> findall() {
		// TODO Auto-generated method stub
		return impl.findAll();
	}

	@Override
	public Account findByAccno(int accno) {
		// TODO Auto-generated method stub
		return impl.findByAccno(accno);
	}

	@Override
	public void delAccount(Account	a) {
		// TODO Auto-generated method stub
		 impl.delete(a);
	}
	

}
