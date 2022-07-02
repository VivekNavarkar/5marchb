package java_program;

public class Prime_Number_Program 
{
// Prime number > 1 --Natural number
// prime number has 2 factors divide by 1 and itself.
// prime number- 2,3,5,7,11,13,17,19,etc
// not prime number- 1,4,6,8,9,10,etc	
	
	public static void main(String[] args)
	{
		 int  num=3;// check 3 is prime number or not
		 int count=0;// initial count is 0
		 
		 if(num>1)
		 {
			 for(int i=1;i<=num;i++) // i=1--3%1,i=2--3%2, i=3--3%3
			 {
				 if(num%i ==0)// (i=1--3%1, i=2--3%2, i=3--3%3 ==0)---2
					 count++;// count is incresed
			 }
			 if(count==2)// it means we have only 2 factors divide by 1 and itself hence count= 2 is taken.
				// if is rite excute if parts oterwise ex else part
			 {
				 System.out.println("prime number");
			 }
			 else
			 {
				 System.out.println("not prime number");
			 }
		 }
		 else 
		 {
			 System.out.println("Not prime number"); // if first if is false than execute this 
	     }

	}

}
