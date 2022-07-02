package string15;

public class Concate_String 
{
// how to concate- multiple string values into one string
	public static void main(String[] args)
	{
		String s1= "Vivek";
        String s2= "Madhukar"; 
        String s3= "Navarkar";
        
        System.out.println(s1+" ".concat(s2+" ").concat(s3));
// how to replace the multiple values in string
        String DreamCompany="@##Goo*$%&%#@$gle";
        System.out.println(DreamCompany.replace("@##", "").replace("*$%&%#@$", ""));
        
// how to reverse any String  -- we used for loop.
        
        String mydist= "Jalgoan vivek ";
        for(int i=mydist.length()-1;i>=0;i--)
        {
        	System.out.print(mydist.charAt(i));
        }
        
	}

}
