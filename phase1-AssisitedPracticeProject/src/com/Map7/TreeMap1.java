package com.Map7;
import java.util.TreeMap;

public class TreeMap1 
{
		public static void main(String[] args) 
		{
			TreeMap<Integer, String> fruit = new TreeMap<Integer, String>();
			
			 fruit.put(5,new String("banana"));
			 fruit.put(4,new String("apple"));
			 fruit.put(6,new String("carrot"));
			 fruit.put(2,new String("falooda"));
			 fruit.put(1,new String("dryfruit"));
			 fruit.put(3,new String("grapes"));
			 fruit.put(8,new String("chickoo"));
			 fruit.put(10,new String("mango"));
			 fruit.put(9,new String("guava"));
			 fruit.put(7,new String("orange"));
			 for(Integer key: fruit.keySet())
			 {
				 	 System.out.println(key  +" : "+ fruit.get(key));
					 System.out.println(fruit.containsValue("grapes"));
					 System.out.println("Is treeMap empty? "+fruit.isEmpty());
					 System.out.println("Value of 3 key: "+ fruit.get(3));
			 }
					
		}
	


}
