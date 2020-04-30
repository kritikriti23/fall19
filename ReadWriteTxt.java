package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteTxt {

	public static void main(String[] args) throws IOException  {
		
		String path = "./data/abc.txt";

	
File f  = new File(path);
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);


String line = null;

List<String> ac = new ArrayList<String>();

while((line=br.readLine()) != null){
	System.out.println(line);
}

System.out.println(br.readLine());
System.out.println(br.readLine());

System.out.println(ac.get(2));

br.close();


}
}
