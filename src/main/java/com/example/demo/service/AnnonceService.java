package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Annonces;

public interface AnnonceService {
	
	Annonces publier(Annonces annonces);
	
	List<Annonces> listes();
	
	Annonces modifier(Long id, Annonces annonces);
	
	String supprimier(Long id);

}