package model.factory_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("james");
		Product card2 = factory.create("gorge");
		Product card3 = factory.create("leonard");
		card1.use();
		card2.use();
		card3.use();
	}

}
