package com.test.app;

public class Course {

	private String name;
	private Professor person;
	private double price;
	private int quantity;
	
	public Course(String name, Professor person, double price){
		this.name = name;
		this.person = person;
		this.price = price;
	}
	
	public Course(String name, Professor person, double price, int quantity){
		this.name = name;
		this.person = person;
		this.price = price;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Professor getPerson() {
		return person;
	}
	
	public String toString(){
		return this.name + " by " + this.person.toString();
	}
	
}
