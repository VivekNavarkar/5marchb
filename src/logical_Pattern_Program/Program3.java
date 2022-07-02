package logical_Pattern_Program;

public class Program3 
{
    public static void main(String[] args) 
	{
    	// *****
    	// ****
    	// ***
    	// **
    	// *
// total row=5, total column=5; initial star=5 and decresed by one by one.star--
    	int star=5;
    	for(int i=1;i<=5;i++) // for row
    	{
    		for(int j=1;j<=star;j++) // for column
    		{
    			System.out.print("*"); 
    		}
    		System.out.println();
    		star--; //for decrese star value.
    	}
	}

}
