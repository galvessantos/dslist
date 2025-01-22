package com.gabriel.dslistboot.controllers;

import com.gabriel.dslistboot.dto.GameDTO;
import com.gabriel.dslistboot.dto.GameListDTO;
import com.gabriel.dslistboot.dto.GameMinDTO;
import com.gabriel.dslistboot.services.GameListService;
import com.gabriel.dslistboot.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
