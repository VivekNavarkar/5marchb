package collection_17;

import java.util.Iterator;
import java.util.TreeSet;

public class TS 
{   /*	1. doesn't allow duplicate 
	   *2. null values: not allowed// NullPointerException
	   *3. order of insertion- Asscending order.
	    4. no default capacity.
	    5. DS: Balanced tree
	    6. storage type: hashtable
	    note: we can store only homogeneous data--ClassCastException
        best choice: To remove duplicate elements when order of insertion is Ascending order.*/

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
         ts.add("vivek");
         ts.add("rushi");
         ts.add("umesh");
         ts.add("rupesh");
       //ts.add(null);  null point exception 
       //ts.add(123);   Class cast Exception
         System.out.println(ts);
         System.out.println(ts.isEmpty());     // false
         System.out.println(ts.contains("vivek"));  // true
         System.out.println(ts.pollFirst());
         // this method is used to remove the first element and retrive data
         System.out.println(ts);
         System.out.println(ts.pollLast());
         System.out.println(ts);
          
         // to print list by using iterator
         Iterator it = ts.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
	}

}
