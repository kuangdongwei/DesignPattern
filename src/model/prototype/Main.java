package model.prototype;

public class Main {

	public static void main(String args[]) {
		//prepare
		Manager manager = new Manager();
		UnderLine pro1 = new UnderLine('*');
		MessageBox pro2 = new MessageBox('~');
		MessageBox pro3 = new MessageBox('/');
		
		manager.register("strong message", pro1);
		manager.register("warning box", pro2);
		manager.register("slash box", pro3);
		
		//create
		Product p1 = manager.create("strong message");
		p1.use("hello world");
		Product p2 = manager.create("warning box");
		p2.use("hello world");
		Product p3 = manager.create("slash bax");
		p3.use("hello world");
		
		
	}
}
