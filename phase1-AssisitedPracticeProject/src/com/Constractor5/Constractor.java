package com.Constractor5;

public class Constractor {
	
		int x;
		double y;

		Constractor(int x)
		     {
		    	 this.x=x;
		    	 System.out.println("practice 1");
		     }
		    	
		     Constractor(double y)
		     {
		    	 this.y=y;
		    	 System.out.println("practice 2");
		     }
		     public void printvalues()
		     {
		    	 System.out.println("print x"+x);
		    	 System.out.println("print y"+y);
		     }
		     
			public static void main(String[] args) {
				Constractor p= new Constractor(5.2);
				p.printvalues();
	}
	


}
