package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Annonces;

public interface AnnonceRepository extends JpaRepository<Annonces, Long>{

}
