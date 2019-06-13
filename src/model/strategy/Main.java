package model.strategy;

public class Main {

	public static void main(String args[]) {
		/*if(args.length !=2)
		{
			System.out.println("usage:java Main randomseed1 randomseed2");
			System.out.println("example:java Main 314 15");
			System.exit(0);
		}*/
		int seed1 = 2;  //Integer.parseInt(args[0]);
		int seed2 = 3;  //Integer.parseInt(args[1]);
		Player player1 = new Player("James",new WinningStrategy(seed1));//玩家采用第一种策略进行游戏
		Player player2 = new Player("Durant",new WinningStrategy(seed2));//玩家采用第二种策略进行游戏
		for(int i=0;i<100;i++)
		{
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if(nextHand1.isStrongThan(nextHand2))
			{
				System.out.println("winnner: "+player1);
				player1.win();
				player2.lose();
			}
			else if(nextHand2.isStrongThan(nextHand1))
			{
				System.out.println("winnner: "+player2);
				player2.win();
				player1.lose();
			}
			else
			{
				System.out.println("even...");
				player1.even();
				player2.even();
			}
		}
		System.out.println("total result: ");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		
	}
}
