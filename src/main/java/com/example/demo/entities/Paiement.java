package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paiement {
	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	
	
	private Long id;
	private String applicant;
	private Integer Rising;
	private String Gerant;
	
	
	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Paiement(Long id, String applicant, Integer rising, String gerant) {
		super();
		this.id = id;
		this.applicant = applicant;
		Rising = rising;
		Gerant = gerant;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getApplicant() {
		return applicant;
	}


	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}


	public Integer getRising() {
		return Rising;
	}


	public void setRising(Integer rising) {
		Rising = rising;
	}


	public String getGerant() {
		return Gerant;
	}


	public void setGerant(String gerant) {
		Gerant = gerant;
	}
	
	
	
	
	
}
