package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.employee;



@Repository
public interface HomeRepository extends CrudRepository<employee, Integer> {

	
	public employee findAllByUsernameAndPassword(String us, String ps);
	
}
