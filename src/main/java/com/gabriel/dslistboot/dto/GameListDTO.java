package com.gabriel.dslistboot.dto;

import com.gabriel.dslistboot.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private String name;
    private Long id;

    public GameListDTO() {}

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
