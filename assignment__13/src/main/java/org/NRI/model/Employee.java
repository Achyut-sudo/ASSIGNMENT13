package org.NRI.model;

import org.NRI.customvalidation.Password;
import org.NRI.customvalidation.name;

public class Employee {

	@name
	private String name;
	@Password
	private String password;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}