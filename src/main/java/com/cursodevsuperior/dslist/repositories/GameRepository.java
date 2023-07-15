package com.cursodevsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursodevsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
