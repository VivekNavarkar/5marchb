package logical_HashMap_Program;

import java.util.HashMap;
import java.util.Set;

public class RepeatingCharectorInTheStringUsingHM
{

	public static void main(String[] args)
	{
		// How to find Repeatitive Chareacter in the string by Using hashmap.
		String str ="abcabcabc";
		// first we creat hashmap object pass argument character as key and integer as value.
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		 
		for(int i=0;i<=str.length()-1;i++)// for loop for move to the char in the string.
		{
			char CharValue = str.charAt(i);// calling char value and store in ref variable
	// now check the key and value is presrnt or not in hashmap by using contains method in if else.
			if(hm.containsKey(CharValue)) // if contains is false add 1 
			{
				hm.put(CharValue, hm.get(CharValue)+1);// put method is used to add / replace value in hm.
				                                      // get method is used to get/ fetch output of the value.
			}
			else 
			{
				hm.put(CharValue,1);
			}
			
		}
		System.out.println(hm);
		
		// using for each loop for set  calling  keyset method with HM obj.
		
		Set<Character> key = hm.keySet();
		for(Character k:key)
		{
			System.out.println(k+ " "+hm.get(k));
		}
	}

}
