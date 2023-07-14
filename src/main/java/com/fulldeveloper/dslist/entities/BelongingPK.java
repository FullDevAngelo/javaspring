package com.fulldeveloper.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable //ENCAPSULANDO DUAS CHAVES EM UMA CLASSE
public class BelongingPK {

	@ManyToOne //MUITOS PARA UM
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToOne //MUITOS PARA UM
	@JoinColumn(name = "list_id")
	private GameList list;
	
	//CONSTRUTOR PADRÃO SEM ARGUMENTOS
	public BelongingPK() {
		
	}

	//CONSTRUTOR COM ARGUMENTOS
	public BelongingPK(Game game, GameList list) {
		super();
		this.game = game;
		this.list = list;
	}

	//GETTERS AND SETTERS
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	//COMPARANDO AS CHAVES
	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
	
	
	
}
