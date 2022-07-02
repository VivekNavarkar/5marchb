package globalAndLocalVariables_3;

 public class GlobalAndLocalVariable 
{
// Global variable declare in the class and OUTSIDE of the Block,Constructor and Method.
	int a=10;// non static globle variable
	int b=20;
	static int c=30;// static global variable
	static int d=40;
	static float e=86.91f;

 public static void main(String[] args)
 {
	GlobalAndLocalVariable gv = new GlobalAndLocalVariable();
	    gv.add(); // calling non static method same class 
     
	    sub();  // calling static method same class
 }	
 public void add()  // non static method
 {	
   // Local Variable declare in the INSIDE of the Block,Constrctor,Method.
	  // we call the static and non static variable in the non static method 
		 int sum =a+b;// non static variable
		 int subs =c-d;// static variable
		
		System.out.println("the sum of  non staic Global Variable is "+sum);
		System.out.println("the sub of  staic Global Variable is "+subs);
 }
 public static void sub() 
 { 
  // we  call only static variable  into static method
		int sub = d-c; // local variable
		System.out.println("the sub of static global variable is  "+sub);
 }
}
