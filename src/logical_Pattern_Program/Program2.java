package logical_Pattern_Program;

public class Program2 
{
     public static void main (String[] argu)
     {
 //  how to print * pattern. 
    	// *
    	// **
    	// ***
    	// ****
    	// *****
  // first count total row and column // count intial starting position is start from 1* add one by one.
  // row= 5, column= 5                //  initial star=1 
  // for print we used for loops, 
    	 
    	int star=1;
    	for(int i=1;i<=5;i++)// outer for loop for row
    	{
    		for(int j=1;j<=star;j++)// inner for loop for column
    		{
    			System.out.print("*");
    	    }
    		System.out.println();
    		star++;// for incresed the star 
    	}
    	
     }
}
