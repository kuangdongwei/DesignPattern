package model.adapter;

import java.io.IOException;

public interface Fileio {

	public void readFromFile(String filename) throws IOException;
	public void writeFromFile(String filename) throws IOException;
	public void setValue(String key,String value);
	public String getValue(String key);
}
