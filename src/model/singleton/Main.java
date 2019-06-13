package model.singleton;

public class Main {

	public static void main(String args[]) {
		System.out.println("***start***");
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		if(ob1==ob2)
			System.out.println("two instances are same");
		else
			System.out.println("two instances are not same");
		System.out.println("***end***");
	}
}
