package model.bridge;

public class Display {

	private DisplayImpl object;
	public Display(DisplayImpl object) {
		this.object = object;
	}
	
	public void open() {
		object.rawOpen();
	}
	
	public void print() {
		object.rawPrint();
	}
	
	public void close() {
		object.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
}
