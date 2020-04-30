package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CSVFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	String path = "./data/myCSV.csv";

	
	File f  = new File(path);
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	
	br.write("name,class,grade");
	br.newLine;
	br.write("James, Kriti, Moon");


}
