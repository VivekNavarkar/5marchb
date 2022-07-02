package collection_17;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueStudy 
{
// condition is same as tree set. 
	public static void main(String[] args)
	{
	  PriorityQueue pq = new PriorityQueue(); 
      pq.add('x');
      pq.add('a');
      pq.add('m');
      pq.add('b');
      pq.add('z');
      pq.add('y');
      System.out.println(pq);
      
     System.out.println(pq.element());
  // Retrieves, but does not remove, the head of this queue.it throws an exception ifthis queue is empty. 
     System.out.println(pq);
     System.out.println(pq.poll());
  //Retrieves and removes the head of this queue,or returns null if this queue is empty
     System.out.println(pq);
     System.out.println(pq.peek()); 
  //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
     System.out.println(pq);
 // to print list by using iterator
     Iterator it = pq.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
    }
	
    
}
