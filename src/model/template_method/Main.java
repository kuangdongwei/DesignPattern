package model.template_method;

public class Main {

	public static void main(String args[]) {
	AbstractDisplay testch = new CharDisplay('A');
	AbstractDisplay testString = new StringDisplay("Template");
	testch.display();
	testString.display();
	}
}
