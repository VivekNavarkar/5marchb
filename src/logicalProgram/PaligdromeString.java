package logicalProgram;

import java.util.Scanner;

public class PaligdromeString 
{
     //Palindrome String --MOM-->MOM,LEVEL-->LEVEL---reverse name is same as origanal name, Palindrome number-->121--121
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter value ");
        String  orignal = sc.next();
        String  reverse = "";
        for(int i=orignal.length()-1;i>=0;i--)
        {
        	reverse=reverse+orignal.charAt(i);
        }
        System.out.println("Given String is "+orignal);
        System.out.println("Reverse string is "+reverse);
       
    //for palindrome string by using if else CS.
        if(orignal.equals(reverse))
        {
        	System.out.println("String is Palindrome");
        }
        else
        {
        	System.out.println("String is not Palindrome");
        }
	}
	

}
