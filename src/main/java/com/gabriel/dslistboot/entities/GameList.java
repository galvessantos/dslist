package com.gabriel.dslistboot.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table (name = "tb_game_list")
public class GameList {


    private String name;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    public GameList () {}

    public GameList(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
