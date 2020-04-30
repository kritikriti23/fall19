package externalFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		
		String path = "/Users/kritidhungel/Uhhj/ClassEight/data/myfile.properties";
		
		Properties prop = new Properties();
	    FileInputStream fs = new FileInputStream(path);
		
	    prop.load(fs);
	    
	    String n = prop.getProperty("browser");
		
	    
		System.out.println("your browser  is: " + prop.getProperty("browser"));
		
		//or this is another way to print it out 
		
		System.out.println(prop.getProperty("user"));

	}

}
