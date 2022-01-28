package com.FileHandling18;
import java.io.FileWriter;

public class WriteFile {
	
		public static void main(String[] args) {
			String data="i am writing the data inside the file";
	try {
		FileWriter output= new FileWriter("C:\\\\Users\\\\dell\\\\Downloads\\\\training folder\\\\Demo2.txt");
		output.write(data);
		System.out.println("data is written inside the file");
		output.close();
	}
	catch(Exception e) {
		e.getStackTrace();
	}
		}
	
}
