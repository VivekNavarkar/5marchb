package collection_17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Stydy 
{
//	1. duplicate are allowed in LinkedList       2. allows any no of null values
//	3. order of insertion-maintain          	4. storage type: index
// 	* 5. no Default capacity in linkedlist     *6. data structure: linear
//	*7. best choice: manipulation operation   i.e. insertion in between linkedlist or delete()
//	*8. worst choice: retrival operation (random access interface is not implemented)

   /*Cursor
   1.Iterator-- all the types of  collection object  --universal curser (7)
   2. listIterator  -- only for list interface type impl classes  --not an universal curser(3)
   3. enumeration -- legecy  --not universal curser(vector-1) */

	public static void main(String[] args) 
	{
    LinkedList ll = new LinkedList();
    ll.add(100);
    ll.add(25);
    ll.add('v');
    ll.add("LinkedLink");
    ll.add(100);
    System.out.println(ll);
    System.out.println("==================================");
    Iterator itr = ll.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    ListIterator lit = ll.listIterator();
    System.out.println("===========================");
    while(lit.hasNext())
    {
    	System.out.println(lit.next());
    }
    System.out.println("===========================");
    for(int i=0;i<=ll.size()-1;i++) 
    {
    	System.out.println(ll.get(i));
    }
    System.out.println("===========================");
    for(Object a:ll)
	{
		System.out.println(a);
    }
    
	}

}
