package com.FileHandling18;
import java.io.File;
public class CreateFile 
{
	public static void main(String[] args)
	{
			try {
				
			File file=new File("C:\\Users\\dell\\Downloads\\training folder\\Demo2.txt");
			if(file.createNewFile()) {
				System.out.println("file is created");
			}else {
				if(file.exists())
				{
				System.out.println("file already exists");
				System.out.println("file path"+file.getAbsolutePath());
				System.out.println("file length"+file.length());
				System.out.println("file name"+file.getName());
				System.out.println("file class"+file.getClass());
				System.out.println("file parent"+file.getParent());
				System.out.println("file space"+file.getUsableSpace());
			}
			else {
				System.out.println("file doesnt exists");
			}
				Boolean b= file.delete();
				  if(b==true)
	              {
	              	System.out.println("File deleted !!");
	              }
	              else
	              {
	              	System.out.println("File not deleted");
	              }
			}
			}
			
			catch(Exception e){
			e.printStackTrace();
			}
	}
	
}
