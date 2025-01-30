package com.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	
	@Id
	private int id;
	private String name;
	private String username;
	private String password;
	private String mobile;
	private String age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "HomeController [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", mobile=" + mobile + ", age=" + age + "]";
	}
	

}
