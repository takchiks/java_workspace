package com.cogent.files;

import java.io.Serializable;

public class Player implements Serializable {
	private String name;
	private int score;
	private int coins;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public Player(String name, int score, int coins) {
		super();
		this.name = name;
		this.score = score;
		this.coins = coins;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", coins=" + coins + "]";
	}
	
}
