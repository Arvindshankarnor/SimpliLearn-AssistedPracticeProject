package com.Collection6;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1
{
	
	public static void main(String[] args){
			
			ArrayList<String> al=new ArrayList<String>();  
			
			System.out.println("Initial size of Arraylist is "+ al.size()); 
			
			al.add("Hai");
			al.add("Hello");
			System.out.println("Arraylist is "+al);
			System.out.println("New size of Arraylist is "+al.size()); 
			
			
			
			al.add(1,"How are you");
			System.out.println("New Arraylist is "+al);
			System.out.println("New size of Arraylist is "+al.size());
			
			System.out.println("element at position 1 is  : "+ al.get(1));
		
			Collections.reverse(al); 
			System.out.println("Reversed arraylist is : "+ al);  
		
			al.set(2, "Bye"); 
	        System.out.println("ArrayList after setting/replacing element at position 2 is : " + al);
	        
	        al.remove(2);
	        System.out.println("New Arraylist is "+al);
	        
	        al.remove("Hello");
	        System.out.println("New Arraylist is "+al);
	        
	        System.out.println(al.contains("Hello"));
	       
	}
	
}
