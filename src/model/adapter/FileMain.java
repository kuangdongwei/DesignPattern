package model.adapter;

import java.io.*;
public class FileMain {

	public static void main(String args[]) {
		Fileio f = new FileProperties();
		try {
		f.readFromFile("Docs/file.txt");
		f.setValue("year", "2019");
		f.setValue("month", "05");
		f.setValue("day", "22");
		f.setValue("name", "kuangdongwei");
		f.writeFromFile("Docs/newfile.txt");
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
