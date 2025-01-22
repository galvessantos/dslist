package com.gabriel.dslistboot.repositories;

import com.gabriel.dslistboot.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
