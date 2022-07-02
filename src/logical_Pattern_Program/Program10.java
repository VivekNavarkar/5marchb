package logical_Pattern_Program;

public class Program10 
{
    public static void main(String[] args) 
    {
    	// *        *
    	// **      **
    	// ***    ***
    	// ****  ****
    	// **********
    	// ****  ****
    	// ***    ***
    	// **      **
    	// *        *
  //total row =9; total column=10,
  //star1-->1 space1-->4-->left side -->star1++ and space1-- upto 5 than viceversa.
  //star2-->1 space2-->4-->right side-->star2++ and space2-- upto 5 than viceversa.
    	int star1=1;
    	int space1=4;
    	int star2=1;
    	int space2=4;
    	
    	for(int i=1;i<=9;i++)
    	{
    		for(int j=1;j<=star1;j++)
    		{
    			System.out.print("*");
    		}
    		for(int k=1;k<=space1;k++)
    		{
    			System.out.print(" ");
    		}
    		for(int l=1;l<=space2;l++)
    		{
    			System.out.print(" ");
    		}
    		for(int m=1;m<=star2;m++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    		if(i<5) 
    		{
    		    star1++;
    		    space1--;
    		    star2++;
    		    space2--;
    		}
    		else
    		{
    			star1--;
        		space1++;
        		star2--;
        		space2++;
    		}
    	}
	}
}
