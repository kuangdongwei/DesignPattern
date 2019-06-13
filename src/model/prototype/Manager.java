package model.prototype;

import java.util.HashMap;

public class Manager {

	@SuppressWarnings("rawtypes")
	private HashMap showcase = new HashMap();
	@SuppressWarnings("unchecked")
	public void register(String name,Product proto) {
		showcase.put(name, proto);
	}
	
	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}
}
