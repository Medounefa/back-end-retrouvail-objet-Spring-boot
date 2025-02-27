package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.AnnonceRepository;
import com.example.demo.entities.Annonces;


@Service
public class AnnonceServiceImpl implements AnnonceService{
	
   private final AnnonceRepository annonceRepository = null;

	@Override
	public Annonces publier(Annonces annonces) {
		// TODO Auto-generated method stub
		return annonceRepository.save(annonces);
	}

	@Override
	public List<Annonces> listes() {
		return annonceRepository.findAll();
	}

	@Override
	public Annonces modifier(Long id, Annonces annonces) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String supprimier(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
