package composition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry{

	private String name;
	private List<Entry> directory = new ArrayList<Entry>();
	
	public Directory(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size = 0;
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext())
		{
			Entry entry = (Entry)it.next();
			size+=entry.getSize();
		}
		return size;
	}

	@Override
	protected void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix + "/"+this);
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext())
		{
			Entry entry = (Entry)it.next();
			entry.printList(prefix + "/" + name);
		}
	}
	
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	
}
