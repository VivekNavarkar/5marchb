package java_program;

public class FindVovelsInString 
{
//vovels---a,e,i,o,u
	public static void main(String[] args) 
	{
		String s= "Suhani";
        for(int i=0;i<=s.length()-1;i++)
        {
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        	//System.out.println("given string contains "+s.charAt(i)+" at the index "+i);
        	System.out.println(s.charAt(i));
        }
	}

}
