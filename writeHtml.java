package externalFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class writeHtml {

	public static void main(String[] args) throws IOException {

		Set<Integer> randomnum = new TreeSet<Integer>();
		// Generate Random 500 unique numbers
		// find Nth smallest number
		// range fro, 100 to 1000
		Random rand = new Random();

//		for (int i = 0; i < 500; i++) {
//			int randNum = rand.nextInt((1000 - 100) + 1) + 100;
//			randomnum.add(randNum);

		// System.out.print(i+": ");

//    System.out.println(randomnum);
//    randomnum.add(randNum);

		while (randomnum.size() < 500) {
			int randNum = rand.nextInt((1000 - 100) + 1) + 100;
			randomnum.add(randNum);
		}

		System.out.println(randomnum);
		System.out.println(randomnum.size());

		Object[] allRandom = randomnum.toArray();

		// -----------------------------------------------------

		String path = "./data/web.html";

		File f = new File(path);
		FileWriter fr = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fr);

		bw.write("<html><head><title>");
		bw.newLine();
		bw.write("500 Random Numbers");
		bw.newLine();
		bw.write("</title></head><body><h1><center> My 500 Random Numbers</center></h1>");

		bw.write("<ol>");

		for (Object item : randomnum) {
			bw.write("<li>" + item + "</li>");

		}

		bw.write("<ol>");
		bw.write("</body></html>");
		bw.close();
	}
}
