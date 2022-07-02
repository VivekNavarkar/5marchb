package logical_Pattern_Program;

public class Program5
{   //      *
    //     * *
	//    * * *
	//   * * * *
	//  * * * * *
    public static void main (String [] argu)
    {
    	// total row =5, total column=9, intial star=1,-->star++. initial space=4-->space--.
    	
    	int star =1;
    	int space=4;
    	for(int i=1;i<=5;i++)// outer for loop for row
    	{
    		
    	    for(int k=1;k<=space;k++)// inner for loop for space
            {
               	System.out.print(" ");
            }
            for(int j=1;j<=star;j++) // inner for loop for star
            {
            System.out.print("* ");
            }
         
            System.out.println();
            star++;
            space--;
    	}
    }
}
