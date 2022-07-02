package logicalProgram;

public class Compare_two_int_Array 
{
  public static void main (String [] argu)
  {
	  int [] ar= {1,2,3,4};
	  int [] arr= {1,2,3,4,5};
	  int [] ar1= {1,2,3};
	//Compare_two_int_Array -- by using equals method
	  System.out.println(ar.equals(ar1));//  False 
	  System.out.println(ar.equals(arr));// False 
	  System.out.println(ar.equals(ar));// True
  }
}