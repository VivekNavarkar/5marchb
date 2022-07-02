package collection_17;

import java.util.HashSet;
import java.util.Iterator;

public class HashSET_Study {
//	1. Doesn't allow duplicate values
//	2. Allow only 1 null value.
//	*3. order of insertion-random insertion
//	4. storage type: hashtable
//	5. no default capacity
//	6. DataStorage: Hashtable	
//	best choice: To remove duplicate elements when order of insertion is not mandatory.

	public static void main(String[] args) 
	{
	  HashSet<String> hs = new HashSet<String>();
	  hs.add(null);
	  hs.add(null);
	  hs.add("vivek");
	  hs.add("snehal");
	  hs.add("maruti");
	  hs.add("suhani");
	  hs.add("100");  
	  System.out.println(hs.size());	 
	  System.out.println(hs);
      System.out.println("================================");
	//to print list by using for each method
	  for(String h:hs)
	  {
		  System.out.println(h);
	  }
	  System.out.println("================================");
	  
	  Iterator it = hs.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  System.out.println("================================");
	  for(int i=0;i<=hs.size()-1;i++)
	  {
		  System.out.println(hs);//get method is not apply
	  }
	}

}
