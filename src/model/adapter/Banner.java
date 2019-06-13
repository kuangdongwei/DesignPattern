package model.adapter;

public class Banner {

	private String transilator;
	public Banner(String transilator)
	{
		this.transilator = transilator;
	}
	
	public void showWithParen()
	{
		System.out.println("+++"+transilator+"+++");
	}
	public void showWithAster()
	{
		System.out.println("---"+transilator+"---");
	}
}
