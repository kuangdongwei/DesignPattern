package model.builder;

public class Main {

	public static void main(String args[]) {
		System.out.println("this is a text file");
		System.out.println(" ");
		TextBuilder textObject = new TextBuilder();
		Director testtext = new Director(textObject);
		testtext.construct();
		System.out.println(textObject.getResult());
		
		System.out.println("this is a csv file");
		System.out.println(" ");
		CSVBuilder csvObject = new CSVBuilder();
		Director testtext1 = new Director(csvObject);
		testtext1.construct();
		System.out.println(csvObject.getResult());
		
		System.out.println("this is a HTML file,for details goto browser");
		System.out.println(" ");
		HTMLBuilder htmltest = new HTMLBuilder();
		Director testtext2 = new Director(htmltest);
		testtext2.construct();
		System.out.println(htmltest.getResult());
		
	}
}
