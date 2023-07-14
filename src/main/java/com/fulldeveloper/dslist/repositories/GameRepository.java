package com.fulldeveloper.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fulldeveloper.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{ //AQUI É A CAMADA DE ACESSO A DADOS, É ELA QUE REALIZA A CONSULTA DO BD
	
	
	
}
