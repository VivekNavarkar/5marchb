package java_program;

import java.util.Scanner;

public class Reverse_number 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a num");
	    int num = sc.nextInt();// 1234
   // 1.Using algorithm
	    int rev =0;
	    while(num!=0)
	    {
	    	rev=rev*10+ num%10;
	    	num=num/10;
	    }
	    System.out.println("Reverse Number is "+rev);
	}

}
