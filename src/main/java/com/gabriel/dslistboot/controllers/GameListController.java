package com.gabriel.dslistboot.controllers;

import com.gabriel.dslistboot.dto.GameDTO;
import com.gabriel.dslistboot.dto.GameListDTO;
import com.gabriel.dslistboot.dto.GameMinDTO;
import com.gabriel.dslistboot.dto.ReplacementDTO;
import com.gabriel.dslistboot.services.GameListService;
import com.gabriel.dslistboot.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping (value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
