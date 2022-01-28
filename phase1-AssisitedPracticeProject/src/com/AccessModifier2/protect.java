package com.AccessModifier2;

public class protect {
	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 


	public static void main(String[] args)
		{
			protect  obj = new protect();   
		       obj.display();  
		}

	

}
