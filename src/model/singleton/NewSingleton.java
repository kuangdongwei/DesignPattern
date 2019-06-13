package model.singleton;

public class NewSingleton {

	private static NewSingleton singleton = null;
	private NewSingleton() {
		System.out.println("made a instance");
		slowdown();
	}
	
	public NewSingleton getInstance() {
		if(singleton==null)
		{
			singleton = new NewSingleton();
		}
		else
			System.out.println("error");
		return singleton;
	}
	private void slowdown() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
