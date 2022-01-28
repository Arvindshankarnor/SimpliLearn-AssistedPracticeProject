package com.AccessModifier2;

public class PrvAcc {
	private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 




	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PrvAcc  obj = new PrvAcc(); 
       
	}



}
