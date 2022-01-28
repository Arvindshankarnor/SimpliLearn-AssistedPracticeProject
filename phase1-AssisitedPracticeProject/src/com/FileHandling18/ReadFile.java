package com.FileHandling18;
import java.io.FileReader;
public class ReadFile
{
	
		public static void main(String[] args)
		{
		    char[] Array= new char[60];
		    try {
			FileReader input=new FileReader("C:\\Users\\dell\\Downloads\\training folder\\Demo2.txt");
			input.read(Array);
			input.close();
		    }
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
			

		}

	


}
