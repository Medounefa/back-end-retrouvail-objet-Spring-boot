package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Address {

	
	private String name;
	private String Gerant;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Address(String name, String gerant) {
		super();
		this.name = name;
		Gerant = gerant;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGerant() {
		return Gerant;
	}

	public void setGerant(String gerant) {
		Gerant = gerant;
	}
	
	
	
	
}
