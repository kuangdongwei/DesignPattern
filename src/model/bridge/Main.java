package model.bridge;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("��ʾ�ַ���");
	//��������������ʵ��
	DisplayImpl test = new StringDisplayImpl("hello bridge pattern");
	Display object1 = new Display(test);
	//һ����������ʵ��
	Display object2 = new Display(new StringDisplayImpl("hellojava"));
	CountDisplay object3 = new CountDisplay(new StringDisplayImpl("hello Chandler"));
	MoreDisplay object4 = new MoreDisplay(new StringDisplayImpl("display more"));
	object1.display();
	object2.display();
	object3.display();
	object3.multiDisplay(4);
	object4.moredisplay("java best");
	
	System.out.println(" ");
	
	System.out.println("��ʾ�ַ�");
	Display newtest = new Display(new CharDisplayImpl('D'));
	CountDisplay newtest1 = new CountDisplay(new CharDisplayImpl('F'));
	MoreDisplay newtest2 = new MoreDisplay(new CharDisplayImpl('E'));
	newtest.display();
	newtest1.display();
	newtest1.multiDisplay(2);
	newtest2.moredisplay("chardisplay");
	
	}
}
