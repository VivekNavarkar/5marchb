package logicalProgram;

public class ReverseString_WithoutString 
{
  public static void main (String[] argu)
  {
	// 123--->reverse 321. without string and by using division/ and moduler%.
	  int num=123;
	  int rev=0;// reference variable for addition.
 // System.out.println(" division /"+num/10); // 123/10=12
 // System.out.println(" moduler/reminder % "+num%10);// 123/10=12 -->3%
	 
	  for(int i=num;i>0;i=i/10)
	  {
		  int remd= i%10;  // 123/10=12-->3%,   12/10=1 --> 2%  1/10=0  --> 1%
		  rev =rev*10+remd;// 0*10+3=3,        3*10+2=32,       32*10+1=321.
	  }
	  System.out.println(rev);
  }
}
