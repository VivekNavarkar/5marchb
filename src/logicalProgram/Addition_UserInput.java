package logicalProgram;

import java.util.Scanner;

public class Addition_UserInput 
{

	public static void main(String[] args) 
	{
	// addition of two int value a and b--> by using Scanner class for UserInput
		 Scanner sc = new Scanner(System.in); // crete Scanner class obj and pass System.in as argu
		 System.out.println("Enter A value ");
		 int a = sc.nextInt(); //declare variable a = call sc obj with scanner methode of nextint for int value a
		 System.out.println("Enter B value");
         int b = sc.nextInt();
         int sum =a+b;
         System.out.println("addition of a+b is "+sum);// uesd to get user output
	}

}
