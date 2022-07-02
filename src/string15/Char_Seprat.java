package string15;

public class Char_Seprat {
// how to  Seprate the UpperCase and LowerCase Char in the string by using for loop?
	public static void main(String[] args) 
	{
	String s="ViveK NavarkaR";
	String lower= "";
    String upper= "";
    for(int i=0;i<=s.length()-1;i++)
    {
    	char ch = s.charAt(i);
    	if(ch>=65 && ch<=90) // A=65 and Z= 90
    	{
    		upper = upper+ch;
    	}
    	else
    	{
    		lower=lower+ch;
    	}
    	System.out.println(upper);
    	System.out.println(lower);
    	
    }

	}

}
