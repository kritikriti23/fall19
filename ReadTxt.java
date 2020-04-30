package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {

	public static void main(String[] args) throws IOException {
		
		String path = "./data/abc.txt";

		
		File f  = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

	}

}
