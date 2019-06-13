package model.prototype;

public interface Product extends Cloneable{

	public abstract void use(String s);
	public  Product createClone();
}
