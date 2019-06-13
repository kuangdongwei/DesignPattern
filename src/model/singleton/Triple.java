package model.singleton;

public class Triple {

	private int id ;
	private Triple(int id) {
		System.out.println("the instance "+id+" is created");
		this.id = id;
	}

	private static Triple[] triple =  {
			new Triple(0),
			new Triple(1),
			new Triple(2),
	};
	
	public static Triple getInstance(int id) {
		return triple[id];
	}
	public String toString() {
		return "[Triple id = "+id+"]";
	}
}
