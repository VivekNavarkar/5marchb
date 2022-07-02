package logicalProgram;

public class ReverseNumber_usingString 
{

	public static void main(String[] args) 
	{
	// we have num=123 reverse it as  321 by using String
       int num =123;
    // now convert this int number into string by using Integr class and to String method
       String s = Integer.toString(num);
       String rev = ""; // creat ref variable for addition.
       for(int i=s.length()-1;i>=0;i--)
       { 
    	   rev=rev+s.charAt(i);
    	  
       }
       System.out.println(rev);// reverse this into int
    // now convert this String num into int number by using Integer class and parseInt method
       int revNum = Integer.parseInt(rev);
       System.out.println("Orignal Number is "+num);
       System.out.println("Reverse Number is "+revNum);
	}

}
