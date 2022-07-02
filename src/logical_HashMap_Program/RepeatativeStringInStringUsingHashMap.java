package logical_HashMap_Program;

import java.util.HashMap;
import java.util.Set;

public class RepeatativeStringInStringUsingHashMap {

	public static void main(String[] args) 
	{
// How to find Repeatitive String in the string by Using hashmap.
		 String str ="abc def ghi jkl mno pqr";
// first we split this string into number of string by using space and store in ref variable string array.
		 String[] ar = str.split(" ");
// now creat hashmap object.
		 HashMap<String,Integer> HM = new HashMap<String,Integer>();
		 
		 for(int i=0; i<=ar.length-1;i++)
		 {
			 String s = ar[i]; // callig array string value and store in ref variable.
	// now check the key and value is present in HM bu using contains method in if else sts.
			 if(HM.containsKey(s))
			 {
				 HM.put(s, HM.get(s)+1);
			 }
			 else
			 {
				 HM.put(s,1);
			 }
		}
		 System.out.println(HM);
	//by using for each loop creat Keyset object using HM obj.
		 Set<String> k = HM.keySet();
		 for(String key:k)
		 {
			 System.out.println(key+" "+HM.get(key));
		 }
	}
}
