package logicalProgram;

public class WhiteSpaceRemove {

	public static void main(String[] args)
	{
		String a="Navarkar";// count how many a in this string-=3 -- replace space into a in char
		String b="p u n e";// count ws in string=3
	    int count = 0;   // ref varible for addition
		
	    for(int i=0;i<=b.length()-1;i++)
		{
		    char space=' ';
		    char myChare= a.charAt(i);
		    if(myChare==space)
		    {
		    	count++;
		    }
		    System.out.println("Number of White Space is "+count);
		}

	}

}
