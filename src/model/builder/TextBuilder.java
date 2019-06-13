package model.builder;

public class TextBuilder extends Builder{

	private StringBuffer buffer = new StringBuffer();
	
	public void makeTitle(String title) {
		buffer.append("==========");
		buffer.append(title);
		buffer.append(".txt==========\n");
	}
	
	public void makeString(String str) {
		buffer.append(str+"\n");
		buffer.append(str+"\n");
		buffer.append(str+"\n");
	}
	
	public void makeItems(String [] items) {
		for(int i=0;i<items.length;i++)
		{
			buffer.append(items[i]+"\n");
		}
	}
	
	public void close() {
		buffer.append("==============text end==============");
	}
	
	public String getResult() {
        String result = buffer.toString();		
		return result;	
	}
}
