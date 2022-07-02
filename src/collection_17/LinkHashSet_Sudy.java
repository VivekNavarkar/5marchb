package collection_17;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSet_Sudy
{
//	1. Doesn't allow duplicate values
//	2. Allow only 1 null value.
//	*3. order of insertion-maintained
//	4. no default capacity
//	*5. DS: Hybrid  (liner+ hashtable)
//	6. storage type: hashtable
//	best choice: To remove duplicate elements when order of insertion is mandatory

	public static void main(String[] args) 
	{
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add(12);
		lhs.add('b');
		lhs.add(null);		lhs.add(null);
		lhs.add(3.14f);
		lhs.add("String");
		
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println("==================================");
		
		for (Object s:lhs)
		{
			System.out.println(s);
		}
		System.out.println("==================================");
		
	    Iterator l = lhs.iterator(); 
	    while(l.hasNext())
	    {
	    	System.out.println(l.next());
	    }
	    for(int i=0;i<=lhs.size();i++)
	    {
	    	System.out.println(lhs);// for loop not used get method is not call
	    	
	    }
	}

}
