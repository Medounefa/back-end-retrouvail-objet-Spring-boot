package com.example.demo.entities;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categories {

	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "objets_id" )
	private Objets objets;

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(Long id, String name, Objets objets) {
		super();
		this.id = id;
		this.name = name;
		this.objets = objets;
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

	public Objets getObjets() {
		return objets;
	}

	public void setObjets(Objets objets) {
		this.objets = objets;
	}
    
	
	
	
}
