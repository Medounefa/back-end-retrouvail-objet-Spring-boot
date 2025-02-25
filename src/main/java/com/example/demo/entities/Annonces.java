package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Annonces {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Type;
	private String lieu;
	private String Description;
	private String Categories;
	private String Miniature;
	private String Utilsateur;
	private Date date;
	
	
	
	@ManyToOne
	@JoinColumn(name = "utilisateurs_id")  
	private Utilisateurs utilisateurs;



	public Annonces(Long id, String type, String lieu, String description, String categories, String miniature,
			String utilsateur, Date date, Utilisateurs utilisateurs) {
		super();
		this.id = id;
		Type = type;
		this.lieu = lieu;
		Description = description;
		Categories = categories;
		Miniature = miniature;
		Utilsateur = utilsateur;
		this.date = date;
		this.utilisateurs = utilisateurs;
	}
	
	
	
	
	
	
	
}
