package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.*;

@Entity
public class Moderator {

	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	private String email;
	
	
	@ManyToMany
    @JoinTable(
        name = "utilisateur_moderateur", 
        joinColumns = @JoinColumn(name = "moderateur_id"), 
        inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<Utilisateurs> utilisateurs;
	
	
	public Moderator() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	


	public Moderator(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}






	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
