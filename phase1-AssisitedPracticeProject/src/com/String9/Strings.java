package com.String9;

public class Strings {
	
		int rollno;  
		 String name;  
		 String city;  
		  
		 Strings(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		public String toString(){           //overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 } 
		 
		 public static void main(String args[]){  
			 Strings s1=new Strings(101,"Arvind","Kalaburagi");  
			 Strings s2=new Strings(102,"Raju","Gulabraga");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
	}
	

}
