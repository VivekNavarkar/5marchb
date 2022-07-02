package method_type_2;

public class Assignment_Maths_PM
{

public static void main(String[] args) 
	{
  // 1) without parameter
		Assignment_Maths_PM a = new Assignment_Maths_PM();
		a.Mathsoperation();
 // 2) with parameter 
		Assignment_Maths_PM aa = new Assignment_Maths_PM();
		aa.Mathsoperation1(100, 50);// variable initilazation
		Mathsoperation2(150,50);
		Assignment_Maths_PM aaa = new Assignment_Maths_PM();
		aaa.Mathsop3(500,250);
		aa.Mathsops(10, 22.77f, 3.14141414d);
	}
// 1) without parameter
 public void Mathsoperation()
    {
     int a=100,b=50,sum=a+b,sub=a-b,mul=a*b,div=a/b;  // variable declaration and initilazation.
      System.out.println("=================================="); // usage
    	  System.out.println("the sum of both is "+sum);
    	  System.out.println("the sub of both is "+sub);
    	  System.out.println("the mul of both is "+mul);
    	  System.out.println("the div of both is "+div);
      System.out.println("===================================");
    }
// 2) with parameter
 public void Mathsoperation1(int a,int b)// variable declaration
    {    
	      int sum=a+b;//variable usage
    	  int sub=a-b;
    	  int mul =a*b;
    	  int div=a/b;
    	  
    	  System.out.println("the sum of both is "+sum);
    	  System.out.println("the sub of both is "+sub);
    	  System.out.println("the mul of both is "+mul);
    	  System.out.println("the div of both is "+div);
    System.out.println("==================================="); 
    }
 public static void Mathsoperation2(int a,int b) 
    {
    	  int sum=a+b;
    	  int sub=a-b;
    	  int mul =a*b;
    	  int div=a/b;
    	  
    	  System.out.println("the sum of both is "+sum);
    	  System.out.println("the sub of both is "+sub);
    	  System.out.println("the mul of both is "+mul);
    	  System.out.println("the div of both is "+div);
    System.out.println("==================================="); 
    }
public void Mathsop3(int a,int b)
   {
        int sum = a+b;
        int sub =a-b;
        System.out.println("the sum of both is "+sum);
  	    System.out.println("the sub of both is "+sub);
   }
public void Mathsops(int x,float y,double z) 
  {
     double sum =x+y+z;
     System.out.println("sum is "+sum);
  }
 }

    	  
      
    
   
