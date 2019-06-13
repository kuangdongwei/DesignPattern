package model.template_method;

public abstract class  AbstractDisplay {

	public abstract void open();
	public abstract void print();
	public abstract void close();
	public  final void display() {  //attention the use of "final" here
		open();
		for(int i=0;i<6;i++)
		{
			print();
		}
		close();
	}
	
}
