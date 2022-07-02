package collection_17;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_List 
{
//	1. duplicate are allowed in vector   2. allows any no of null values
//	3. storage type: index               4. order of insertion-maintain
// 	5. Default capacity for Vector is 10.
//	*6. data structure: doubly          *7. Incremental capacity= current capacity*2
//	*8. Vector is legecy class.
//	9. best choice: retrival operation  (random access interface is implemented in arraylist & vector)
//	10. worst choice: manipulation operation i.e. insertion in between Vector or delete  ()


	public static void main(String[] args) 
	{
		Vector v = new Vector();
        v.add(10);
        v.add("vivek");
        v.add(3.14f);
        v.add('A');
        v.add(10);
        v.add("vivek");
        v.add(null);
        System.out.println(v.size());
        v.remove(5);
       System.out.println(v.contains("vivek"));
        System.out.println(v);// print in single line 
        System.out.println("===================================");
        // for frint in list we have multiple methods 1)for loop 2)for ecch list 3)iterator 4)list iterator 
        // vector is legecy class so one method is add in vector is. 5) enamuration.
        
        Iterator it = v.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println("===================================");
        
        ListIterator lit = v.listIterator();
        while(lit.hasNext())
        {
        	System.out.println(lit.next());
        }
        System.out.println("===================================");
        
        for(int i=0;i<=v.size()-1;i++) 
        {
        	System.out.println(v.get(i));
        }
        System.out.println("===================================");
       for(Object A:v)
        {
        	System.out.println(A);
        }
        System.out.println("===================================");
        
       Enumeration E = v.elements();
        while(E.hasMoreElements())
        {
        	System.out.println(E.nextElement());
        }
        System.out.println("===================================");
	}

}
