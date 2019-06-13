package model.factory_method;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<String> owners = new ArrayList();
	public Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	public void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	@SuppressWarnings("rawtypes")
	public List getOwners() {
		return owners;
	}
}
