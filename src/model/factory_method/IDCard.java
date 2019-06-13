package model.factory_method;

public class IDCard extends Product{

	private String owner;
	IDCard(String owner)
	{
		System.out.println("make "+owner+" s id card");
		this.owner = owner;
	}
	
	public void use() {
		System.out.println("use "+owner+" s id card");
	}
	
	public String getOwner() {
		return owner;
	}
	
}
