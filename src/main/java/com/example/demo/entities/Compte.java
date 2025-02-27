package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compte {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
