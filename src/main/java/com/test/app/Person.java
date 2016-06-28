package com.test.app;

public class Person {
	
	private String name;
	private String email;
	private char gender;
	
	public Person(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	
	public String toString(){
		return this.name + " (" + this.gender + ") at " + this.email;
	}
}

