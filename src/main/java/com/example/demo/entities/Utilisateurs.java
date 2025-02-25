package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Utilisateurs {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	private String telephone;
	private String email;
	private String role;
	
	
	 @ManyToMany(mappedBy = "utilisateurs", fetch = FetchType.LAZY)
	    private List<Moderator> moderator;
	 
	 
	 @OneToMany(mappedBy = "utilisateurs", cascade = CascadeType.ALL)
	    private List<Annonces> annonces;
	
	
	
	public Utilisateurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

	public Utilisateurs(Long id, String name, String telephone, String email, String role, List<Moderator> moderator,
			List<Annonces> annonces) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.role = role;
		this.moderator = moderator;
		this.annonces = annonces;
	}
	
	
	
	
	
}
