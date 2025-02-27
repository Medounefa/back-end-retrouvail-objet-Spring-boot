package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Annonces;
import com.example.demo.service.AnnonceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/annonces")
public class AnnoncesController {
	
	private final AnnonceService annonceservice = null;
	
	@PostMapping("/create")
	public Annonces create(@RequestBody Annonces annonce) {
		return annonceservice.publier(annonce);
	}
	
	
	@GetMapping("/read")
	public List <Annonces> read() {
		return annonceservice.listes();
	}

}
