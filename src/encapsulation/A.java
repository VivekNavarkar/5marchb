package encapsulation;

public class A
{// Encapsulation is prosess in which we can wrapping the data variable and method of class in a single unit.
	// by using EC private variable in other classes.
	
    private int value;// hiding data variable/ data members
   
	
   public void setValue(int x)// data abstraction
   {
	   value=x;
   }
   public int getValue()
   {
	  return value;
   }
}
