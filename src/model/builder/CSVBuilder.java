package model.builder;

public class CSVBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();
	public void makeTitle(String title) {
		buffer.append("==========");
		buffer.append(title);
		buffer.append(".csv==========\n");
	}
	
	public void makeString(String str) {
		buffer.append(str+","+"\n");
		buffer.append(str+","+"\n");
		buffer.append(str+","+"\n");
		buffer.append(str+","+"\n");
		
	}
	
	public void makeItems(String [] items) {
		for(int i=0;i<items.length;i++)
		{
			buffer.append(items[i]+","+"\n");
		}
	}
	
	public void close() {
		buffer.append("===============csv end==============");
	}
	
	public String getResult() {
        String result = buffer.toString();		
		return result;	
	}
}
