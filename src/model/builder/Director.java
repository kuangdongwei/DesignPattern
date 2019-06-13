package model.builder;

public class Director {

	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	/**
	 * ±àÐ´ÎÄµµ
	 */
	public void construct() {   
		builder.makeTitle("DESIGN MODEL");
		builder.makeString("I love java design model");
		builder.makeItems(new String [] {
				"some useful model","singleton model","factory model","builder model"
				,"prototype model","adater model","iterator model"
		});
		builder.close();
	}
}
