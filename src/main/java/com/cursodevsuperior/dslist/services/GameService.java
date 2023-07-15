package com.cursodevsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.entities.Game;
import com.cursodevsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll() {

        List<Game> result = gameRepository.findAll();
        return result;
    }


    
}
