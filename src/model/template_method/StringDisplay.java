package model.template_method;

public class StringDisplay extends AbstractDisplay{

	private String mystring;
	public StringDisplay(String mystring) {
		this.mystring = mystring;
	}
	public void open() {
		System.out.println("+----------+");
	}
	
	public void print() {
		System.out.println("|"+mystring+"|");
	}
	
	public void close() {
		System.out.println("+----------+");
	}
}
