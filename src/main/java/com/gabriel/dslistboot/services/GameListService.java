package com.gabriel.dslistboot.services;


import com.gabriel.dslistboot.dto.GameListDTO;
import com.gabriel.dslistboot.dto.GameMinDTO;
import com.gabriel.dslistboot.entities.Game;
import com.gabriel.dslistboot.entities.GameList;
import com.gabriel.dslistboot.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
