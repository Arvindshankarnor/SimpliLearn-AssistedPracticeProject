package com.Constractor5;

public class Constructor1 {

		int a;
		float b;
		double z;
		
	    //creating four arg constructor  
		Constructor1(int x, int y){  
	    a=x*y;    
	    }     
	    
	   Constructor1(float x, float y){  
	    b= x*y;
	    }  
	    
	    //creating three arg constructor  
	   Constructor1(double x){  
	     z=3.142f*x*x;
	    } 
	    
	  void area()
	    {
		  System.out.println("area of square"+a);
		  System.out.println("area of rectangle"+b);
		  System.out.println("area of circle"+z);
	    	
	    }  
	 
	public static void main(String[] args) {

		   Constructor1 s1= new Constructor1(5,7);
		   Constructor1 s2= new Constructor1(3.142f,4.8f);
		Constructor1 s3= new Constructor1(6f);
	s1.area();
	s2.area();
	s3.area();
	}
	


}
