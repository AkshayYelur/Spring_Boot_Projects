package com.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.employee;
import com.crud.repository.HomeRepository;
import com.crud.service.HomeService;

@Service
public class HomeServiceIMPL implements HomeService  {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public void saveData(employee e) {
		hr.save(e);
		
	}


	@Override
	public employee loginCheck(String us, String ps) {
		
		
		return hr.findAllByUsernameAndPassword(us, ps);
	}


	public Iterable<employee> getAllData() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

}
