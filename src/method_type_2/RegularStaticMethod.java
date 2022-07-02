package method_type_2;

public class RegularStaticMethod 
{
 public static void main(String[] args) // Main Method
 {   
	// call static method from same class
	   add();// only called method name
	   sub();
	   mul();
	// call Static method from other class
       RegularNonStaticMethod.mul();  //other class name.methodname	
       RegularNonStaticMethod.name();
 }
 public static void add()//creat static method
 {
  int a=100;
  int b= 200; 
  int sum = a+b;
  System.out.println("the sum of both is "+sum);
 } 
 public static void sub() 
 {
	String name ="vivek";
    System.out.println("my name is " + name);
 }
 public static void mul() 
 {  int a=20;
    int b=20;
	int sum=a*b;
	System.out.println("multification is"+sum);
 }
 public void div() // non static method
 {
	int a=20;
	int b=20;
	int div=a/b;
	System.out.println("the div is "+div);
 }
 public void result()
 {
   double percentage=86.91d;
   System.out.println("My 10 th percentage is "+percentage);
 }	
}


