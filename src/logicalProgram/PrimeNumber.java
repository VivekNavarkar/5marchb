package logicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// Prime number > 1 --Natural number
		// prime number has 2 factors divide by 1 and itself.
		// prime number- 2,3,5,7,11,13,17,19,etc
		// not prime number- 1,4,6,8,9,10,etc
	//	System.out.println("Enter value");
     //   Scanner sc = new Scanner(System.in);
    //    int a = sc.nextInt();
		int input =5;
		int count =0;
		for(int i=2;i<input;i++)
		{
			if(input%i==0) // 3/3,3/1-- % 0; its didved by 2 times so it is PN. if ip is 4-- 4/4,4/2,4/1 its divded by 3 times
			{
				count++;
			}
			if(count==0)
			{
				System.out.println("Given number is prime number "+input);
			}
			else
			{
				System.out.println("Given number is not prime number "+input);
			}
		}
	}

}
