package logicalProgram;

import java.util.Scanner;

public class FactorialNumber 
{

	public static void main(String[] args) 
	{
		//3!--->3*2*1= 6 is factorial number of 3
		   System.out.println("Enter value");
           Scanner sc = new Scanner(System.in);
           int a=sc.nextInt();
           int fact = 1;// ref variable for multification.
           for(int i=a;i>=1;i--)//3*2*1
           {
        	  fact=i*fact;// 3*1=3,  2*3=6,  1*6=6----6FV
           }
           System.out.println("Factorial value is"+fact);
           
	}

}
