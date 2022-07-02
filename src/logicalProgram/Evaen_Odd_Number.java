package logicalProgram;

import java.util.Scanner;

public class Evaen_Odd_Number
{

	public static void main(String[] args)
	{
	  // how to identify the even-2,4,6,8 and odd -1,3,5,7,9 int nubber.-- by using division/--10/2=5 and remening-%=0 operators
		// int a=10;
		// int b=2;
		// System.out.println("Division "+a/b);---5
		// System.out.println("Ramiander "+a%b);--0
		//even number b%a--> when will be reminder is zero its even number.
		 //                  when will be reminder is not zero its odd number
		
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);// Scanner class for user input 
		int a=sc.nextInt();// scan next int value for  print.
		int b=2;// for division any valu with 2 we get reminder value.
		if(a%b==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("givem number is odd");
		}
	}

}
