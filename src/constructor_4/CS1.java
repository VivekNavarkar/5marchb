package constructor_4;

public class CS1
{   
	int a;  // variable declaration  in the class is call Global variable for constructor
	int b;  
public static void main(String[] args) 
{
	CS1 c1= new CS1(); // creat object in main method 
		c1.sum();      // call the method---objectname.metodname();
		c1.mul();
		c1.div();
		c1.add();
}
//CS1() default constructor creat by compiler--)  after creation of object

//user defind constructor----------------------)  Zero/ without parameter
public CS1()   // creat constructor
{
	a=100; // variable valu 
    b=100;
}
  public void sum()// creat method
  {
	int sum=a+b;//variable intilasation
	int sub=a-b;
	System.out.println("the sum of both is "+sum); // usage for output
	System.out.println("the sub of both is "+sub);
  }
  public void mul()
  {
	int mul=a*b;
   System.out.println("the mul is "+mul);
  }	 
  public void div() 
  {
    int div= a/b;
    System.out.println("div is"+ div);
  }
  public void add() 
  {
    int sum = a+b;
    System.out.println("the addition is "+sum); 
  }
    
}
	
	
       
          
	
	
			
