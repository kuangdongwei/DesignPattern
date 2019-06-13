package model.bridge;

public class StringDisplayImpl extends DisplayImpl{

	private String str;
	private int length;
	public StringDisplayImpl(String str) {
		this.str = str;
		length = str.getBytes().length;
	}
	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++)
		{
			System.out.print("=");
		}
		System.out.println(" ");
	}
	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++)
		{
			System.out.print("=");
		}
		System.out.println(" ");
	}
	
	
}
