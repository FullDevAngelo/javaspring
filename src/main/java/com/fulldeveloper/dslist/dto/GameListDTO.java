package com.fulldeveloper.dslist.dto;

import com.fulldeveloper.dslist.entities.GameList;

public class GameListDTO {
	
	//ATRIBUTOS
	private Long id;	
	private String name;
	
	//CONSTRUTOR PADRÃO
	public GameListDTO() {
	}

	//CONSTRUTOR COM ARGUMENTOS
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	//GETTERS
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
}
