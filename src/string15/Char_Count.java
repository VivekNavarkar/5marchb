package string15;

public class Char_Count {
 // how to claculate uppercase and lowercase char in the string by using for loop?
	public static void main(String[] args) 
	{
	 String s = "ViveK NavarKaR";
	 int lower=0;
	 int upper=0;
	 for(int i=0;i<=s.length()-1;i++)
	 {
		 char ch = s.charAt(i);
		 if(ch>=65 && ch<=90)
		 {
			 upper++;
		 }
	     else
	     {
	    	 lower++;
	     }
	 }
	 
	 System.out.println("lower Char "+lower);
	 System.out.println("upper char "+upper);
	 
	}

}
