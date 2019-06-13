package model.singleton;

public class TripleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		for(int i=0;i<9;i++)
		{
			Triple triple = Triple.getInstance(i%3);
			System.out.println(i+":"+triple);
		}
		System.out.println("end");
       
	}

}
