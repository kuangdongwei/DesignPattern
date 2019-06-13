package model.strategy;

import java.util.Random;
public class WinningStrategy implements Strategy{

	private Random random;
	private boolean won = false;
	private Hand prevhand;
	
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}
	
	public Hand nextHand() {
		if(!won)
		{
			prevhand = Hand.getHand(random.nextInt(3)); //上次没有赢这次则随机出拳
		}
		return prevhand; //上次赢了这次出同样的
	}
	
	public void study(boolean win) {
		won = win;
	}
}
