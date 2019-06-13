package model.strategy;

public class Player {

	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;
	
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	public Hand nextHand() {
		return strategy.nextHand();
	}
	
	//Ê¤Àû
	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}
	
	//Êä
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	
	//Æ½¾Ö
	public void even() {
		gamecount++;
	}
	
	public String toString() {
		return "["+name+";"+gamecount+" games, "+wincount + " win "+losecount+" lose "+"]";
	}
}
