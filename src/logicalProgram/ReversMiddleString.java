package logicalProgram;

public class ReversMiddleString 
{
  public static void main (String[] argu) 
  {
 //  reverse middle  string	  eg pqr-->rqp
	  String sample="abc pqr xyz";
	  String[] ar = sample.split(" ");
	  System.out.println(sample);
	  //String ar[]={"abc","pqr","xyz"}
	               //  0     1      2
	  for(int i=0;i<=ar.length-1;i++)
	  {
	     if(i%2==0)// check odd/even index value
	    	 // 0%2--> when will be reminder is zero its even number.  0&2 is even if part is excute 
			 // 1%2--> when will be reminder is not zero its odd number.  1 is odd else part excute
	     {
	         System.out.print(ar[i]+" ");
	     }
	     else 
	     {
	    	  String s = ar[i];
		      ar[i]=revString(s);
	     System.out.print(ar[i]+" ");
	     }
	  }
  }
	  public static String revString(String inp)
	  {
	     String rev="";
	     for(int i=inp.length()-1;i>=0;i--)
	     {
	       rev=rev+inp.charAt(i);
	     }
	     return rev;
	  }
}
