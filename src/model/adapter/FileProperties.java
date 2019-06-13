package model.adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("serial")
public class FileProperties extends Properties implements Fileio{

	public void readFromFile(String filename) throws IOException{
		load(new FileInputStream(filename));
	}
	
	public void writeFromFile(String filename) throws IOException{
		store(new FileOutputStream(filename), "writeen by fileproperties");
	}
	
	public void setValue(String key,String value) {
		setProperty(key, value);
	}
	public String getValue(String key) {
		return getProperty(key,"");
	}
	
}
