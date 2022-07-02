package polymorphism11;

public class MethodOverLoding
{
// declare the multiple method in same name with different parameter in the same class is call method overloding 
 public static void main(String[] args) 
 { // call the method in  main method 
	 MethodOverLoding ml = new MethodOverLoding();
	 ml.test();
	 ml.test(100, 200);
	 ml.test(1, 2.14f);
	
 }
 public void test()// without parameter method
 {
	int a=10;
	int b=20;
	int sum =a+b;
	System.out.println("the sum is "+sum);
 }
 public void test(int a, int b) // with  same parameter method 
 {    
	 int sum=a+b;
	 System.out.println("the sum of a+b is "+sum);
 }
 public void test(int c,float d) // with diff parameter method
 {  
	 float sum =c+d;
	 System.out.println("the sum of cd is"+sum);
 }
}
