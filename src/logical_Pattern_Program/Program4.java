package logical_Pattern_Program;

public class Program4 
{
    public static void main(String [] argu)
    {
//    * * * * *
//     * * * *
//      * * *
//       * *
//   	  *
//  total row 5, total column = 5 ,initial star =5-->* is decrese , initial space =0-->space is increase.
    	int star = 5;
    	int space= 0;
    	
    	for(int i=1;i<=5;i++)
    	{
    		for(int k=1;k<=space;k++) 
    		{
    		  System.out.print(" ");
    		}
    		
    		for(int j=1;j<=star;j++)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    		star--;
    		space++;
    		
    	}
    	
    }
}
