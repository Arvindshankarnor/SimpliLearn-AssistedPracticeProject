package com.String9;

public class Immutable 
{
		public static void main(String[] args)
		{
			String t = "Delhi";  
			   String o = "Mumbai";
			   String k =  "delhi";
			   String y= new String ("Mumbai");
			   String l= new String ("delhi");
			   String p= new String("Hello");
			   if(o.equals(l))
			   {
				   System.out.println("true....");
			   }
			   else{
				   System.out.println("false....");
			   }
			   if(y.equals(p))
			   {
				   System.out.println("true....");
			   }
			   else{
				   System.out.println("false....");
			   }
			   if(t.equals(o))
			   {
				   System.out.println("true....");
			   }
			   else{
				   System.out.println("false....");
			   }
			   if(k.equals(y))
			   {
				   System.out.println("true....");
			   }
			   else{
				   System.out.println("false....");
			   }
			   if(p.equals(y))
			   {
				   System.out.println("true....");
			   }
			   else{
				   System.out.println("false....");
			   }
			   if((o==l) && (y==p) && (t==o) && (k==y) && (p==y))
	{
		   System.out.println("true....");
	}
	else{
		   System.out.println("false....");
	}
			   
			 }
	


}
