package logical_Pattern_Program;

public class Program7 
{
   public static void main (String [] argu)
   {
	//    *
	//   ***
	//  *****
	// *******
	//total row =4; total column =7, initial star =1-->star+2; in space=3-->space--
	   int star=1;
	   int space =3;
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
		   space--;
		   star=star+2;
	   }
	   
   
   
   
   }
}
