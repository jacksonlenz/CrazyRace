package com.bayviewglen.crazyrace;

import java.util.ArrayList;

//Player
public class Player {
	private String PlayerName;
	private int PlayerPosition;
	private int Checkpoint;
	private int TokenNumber;
	private ArrayList<Card> Cards;
	
	Player(String Name){
		PlayerName=Name;
		PlayerPosition=-1;
		Checkpoint=-1;
		TokenNumber=-1;
	}
	
	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getPlayerPosition() {
		return PlayerPosition;
	}
	
	public int getCheckpoint() {
		return Checkpoint;
	}

	public void setCheckpoint(int checkpoint) {
		Checkpoint = checkpoint;
	}

	public int getTokenNumber() {
		return TokenNumber;
	}

	public void setTokenNumber(int tokenNumber) {
		TokenNumber = tokenNumber;
	}

	public ArrayList<Card> getCards() {
		return Cards;
	}

	public void adjustPosition(int move){
		this.PlayerPosition+=move;
	}
	public void moveForwardOne(){
		this.PlayerPosition++;
	}
	public void addToInventory(Card card){
		this.Cards.add(card);
	}
	
	
}
