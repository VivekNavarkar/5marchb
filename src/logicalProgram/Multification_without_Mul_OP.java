package logicalProgram;

public class Multification_without_Mul_OP 
{
  public static void main(String[] args) 
  {
    //we have 2 numbers num1=4 and num2=5 so multiply this without * operator, 4*5=20
    //we 2 solution 1 is -- 4+4+4+4+4=20 and 5+5+5+5=20
	  
	  int num1=4;
	  int num2=5;
	  int sum=0; // we usd sum=0  for addition num1 value into this.
	  for(int i=1;i<=num2;i++)//12345
	  {
		    sum=sum+num1;
		   //i=1, 0+4=4
		   //i=2, 4+4=8
		   //i=3, 8+4=12
		   //i=4, 12+4=16
		   //i=5, 16+4=20
	  }
	  System.out.println(" multification value is "+sum);
				  
  }
}
