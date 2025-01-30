package com.crud.service;

import com.crud.model.employee;

public interface HomeService {

	
	
	public void saveData(employee s);
	
	public employee loginCheck(String us,String ps);
	
	public Iterable<employee> getAllData();
}
