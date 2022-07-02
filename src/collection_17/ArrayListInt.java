package collection_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListInt 
{
// arraylist is IC of List interface. List interface is extends the collection Interface.
//	1. duplicate are allowded in Arraylist     2. allows any no of null values
//	3. storage type: index	                   4. order of insertion-maintain
// 	5. Default capacity for arraylist is 10.   6. data structure: Resizable
//	7. Incremental capacity= (current capacity*3/2)+1=10*1.5+1=1616*1.5+1=25
//	8. best choice: retrival operation  (random access interface is implemented in arraylist & vector)
//	9. worst choice: manipulation operation i.e. insertion in between arraylist or delete  ()

	public static void main(String[] args)
	{      ArrayList<Integer> al = new ArrayList<Integer>();// specific type method ie int,sring.char etc
		   al.add(1);
		   al.add(2);
		   al.add(3);
		   al.add(4);
		  System.out.println(al); 
		  // for printing in list we used multiple method 
		   for(int i=0;i<=al.size()-1;i++)
		   {
			   System.out.println(al.get(i));
		   }
		   System.out.println("==========================="); 
		   
		   ArrayList ar = new ArrayList(); //Genaric type method
			ar.add(1);// add method is used to addd value in index
			ar.add("vivek");
			ar.add('A');
			ar.add(86.91f);
			ar.add(null);
			ar.add("vivek");
			System.out.println(ar);//calling all object
	        System.out.println(ar.get(0)); // calling  0 index value  
	        ar.add(4, "a");// add value in perticular index
	        System.out.println(ar);
	        ar.remove(5);//remove value in perticular index
	        System.out.println(ar);
	        System.out.println(ar.size());// get size of the arraylist 
	        System.out.println( ar.contains('A'));// this method is used the contains is presenr in arraylist or not
	      
	  //moving through in list by using for loop
	        System.out.println("===========================");
	        for(int i=0;i<=ar.size()-1;i++) 
	        {
	        	System.out.println(ar.get(i));
	        }

	 //moving through in list by using cursor--> iterator-- all types of collection object is call iterator /universal cursor.
		    System.out.println("===========================");   
			Iterator it = ar.iterator();  
		    while(it.hasNext()) // hasnext method is check the next value is available or not if yes then true if no exception
		    {
		    System.out.println(it.next());// if value is available than next method is used to move next value and print
		    }
		    
   //moving through in list by using cursor--> ListIterator --only for list interface type IC.
		    System.out.println("==========================="); 
		    ListIterator lit = ar.listIterator();
			while(lit.hasNext())
			{
				System.out.println(lit.next());
			}
			
	  //moving through in list by using for each list method
		    System.out.println("===========================");   

			for(Object a:ar)
			{
				System.out.println(a);
	        }
	}

}
