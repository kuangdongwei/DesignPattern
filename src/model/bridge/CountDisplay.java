package model.bridge;

public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl object) {
		super(object);
	}
	
	public void multiDisplay(int times) {
		open();
		for(int i=0;i<times;i++)
		{
			print();
		}
		close();
	}
}
