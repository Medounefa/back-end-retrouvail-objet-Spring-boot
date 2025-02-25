package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Compte {
	
	private String Username;
	private String Password;
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	


	public Compte(String username, String password) {
		super();
		Username = username;
		Password = password;
	}
	
	
	






	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	

}
