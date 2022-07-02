package logical_Pattern_Program;

public class Program6 
{
    public static void main(String [] argu)
    {
    	// *******
    	//  *****
    	//   ***
    	//    *
    	// total row =4. total column = 7, initial star = 7---> star--,  initial space =0--->space++
    	 int star=7;
    	 int space =0;
    	 for(int i=1;i<=4;i++)
    	 {
    		 for(int j=1;j<=space;j++)
    		 {
    			 System.out.print(" ");
    		 }
    		 for(int k=1;k<=star;k++)
    		 {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    		 space++;
    		 star=star-2;// star=star-2 because star is decrese in 2 times in next line
    		 
    		 
    	 }
    }
}
