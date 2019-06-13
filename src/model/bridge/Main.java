package model.bridge;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("显示字符串");
	//分两步创建调用实例
	DisplayImpl test = new StringDisplayImpl("hello bridge pattern");
	Display object1 = new Display(test);
	//一步创建调用实例
	Display object2 = new Display(new StringDisplayImpl("hellojava"));
	CountDisplay object3 = new CountDisplay(new StringDisplayImpl("hello Chandler"));
	MoreDisplay object4 = new MoreDisplay(new StringDisplayImpl("display more"));
	object1.display();
	object2.display();
	object3.display();
	object3.multiDisplay(4);
	object4.moredisplay("java best");
	
	System.out.println(" ");
	
	System.out.println("显示字符");
	Display newtest = new Display(new CharDisplayImpl('D'));
	CountDisplay newtest1 = new CountDisplay(new CharDisplayImpl('F'));
	MoreDisplay newtest2 = new MoreDisplay(new CharDisplayImpl('E'));
	newtest.display();
	newtest1.display();
	newtest1.multiDisplay(2);
	newtest2.moredisplay("chardisplay");
	
	}
}
