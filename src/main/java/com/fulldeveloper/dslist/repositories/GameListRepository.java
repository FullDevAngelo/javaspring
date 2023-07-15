package com.fulldeveloper.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fulldeveloper.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
