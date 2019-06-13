package model.singleton;

public class TicketMain {

	public static void main(String args[])
	{
		System.out.println("***start***");
		for(int i=0;i<10;i++)
		{
			System.out.println(i+":"+TicketMaker.getInstance().tickitAdder());
		}
		System.out.println("***end***");
	}
}
