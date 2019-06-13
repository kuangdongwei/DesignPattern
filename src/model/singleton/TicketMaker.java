package model.singleton;

public class TicketMaker {

	private int ticket = 1000;
	private static TicketMaker singleton = new TicketMaker();
	
	private TicketMaker() {
		System.out.println("create  tickets");
	}
	
	public  static TicketMaker getInstance()
	{
		
		return singleton;
	}
	
	public synchronized int tickitAdder()
	{
		return ticket++;
		
	}
}
