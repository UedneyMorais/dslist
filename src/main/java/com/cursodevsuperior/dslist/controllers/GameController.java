package com.cursodevsuperior.dslist.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.entities.Game;
import com.cursodevsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {

        List<Game> results = gameService.findAll();

        return results.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
