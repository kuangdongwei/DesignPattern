package model.bridge;

public class MoreDisplay extends Display{

	public MoreDisplay(DisplayImpl object) {
		super(object);
	}
	
	public void moredisplay(String string) {
		open();
		for(int i=0;i<4;i++) {
			System.out.println(string);
		}
		print();
		for(int i=0;i<4;i++)
		{
			System.out.println(string);
		}
		close();
	}
}
