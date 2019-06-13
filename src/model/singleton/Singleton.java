package model.singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("created a instance");
	}
	
	public static Singleton getInstance() {
		
		return singleton;
	}
}
