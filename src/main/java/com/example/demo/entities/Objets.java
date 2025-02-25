package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Objets {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "objets", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Categories> categories;
	
	
	public Objets() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public Objets(Long id, String name, List<Categories> categories) {
		super();
		this.id = id;
		this.name = name;
		this.categories = categories;
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











	public List<Categories> getCategories() {
		return categories;
	}











	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}
	
	
	
	
	
	
	

}
