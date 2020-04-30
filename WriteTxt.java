package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTxt {

	public static void main(String[] args) throws IOException {
		

		
		String path = "./data/abcW.txt";

		
		File f  = new File(path);
		FileWriter fr = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fr);
		
		String name = "James bond";
		
		bw.write(name);
		bw.newLine();
		bw.write("I love you Moon Ghimire");
		bw.newLine();
		bw.write("I wanna marry you");
		bw.newLine();
		bw.write("you are the best fiance");
		bw.newLine();
		bw.write("marriage loading");
		
		bw.close();
	}

}
