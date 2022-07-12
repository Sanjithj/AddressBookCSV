package com.bridgelabz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVfile {
	public static void main(String[] args)throws IOException {
	
		File csvfile = new File("C:\\Users\\sanji\\eclipse-workspace\\Classwork");
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String line = "";
		try {
			while((line = br.readLine()) != null) {
				String[] count = line.split(",");
				System.out.println(count[0]+" "+count[1]+""+count[2]);
			}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
		}
}
}
