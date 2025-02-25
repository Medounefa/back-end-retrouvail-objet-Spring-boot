package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Moderator;

public interface ModeratorRepository extends JpaRepository <Moderator, Long>{

}
