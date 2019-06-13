package model.bridge;

public class CharDisplayImpl extends DisplayImpl {

	private char ch;
	public CharDisplayImpl(char ch) {
		this.ch = ch;
	}
	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		
		System.out.println("~~~~begin~~~~");
	}
	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		System.out.println(ch);
	}
	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		
		System.out.println("~~~~end~~~~");
	}
}
