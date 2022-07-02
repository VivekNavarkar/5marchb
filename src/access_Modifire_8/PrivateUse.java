package access_Modifire_8;

public class PrivateUse  // Private class is use only same class./ it is cant call other class
{
	private int a=10;// private Global variable/ it is scope in same class
    int b=20;        //default Global varaiable/ it is scope  with in package
	public int c=30; // public Global variable/ it is scope  with in Project


 public static void main(String[] args)
 {  
	 myname();// calling public class static method 
	surname();// calling private class static method
	
	PrivateUse p =new PrivateUse();
	           p.modifire1();// call private modifire non static method in same class
	           
    System.out.println(p.a);// call  global private variable in same class
 }
 public static void myname()
 {   String name="Vivek ";
	 System.out.println("My name is "+name);
 }
 private static void surname() 
 {   String name="Navarkar";
	 System.out.println("My surname is "+name);
 }

   private void modifire1()
   { 
	System.out.println("Private Modifire ");
   }
   void modifire2()
   {
	System.out.println("Default Modifire");
   }
   public void  modifire3()
   {
	 System.out.println("Public Modifire");
   }
   protected void modifire4()
   {
	   System.out.println("protected modifire");
   }
 
}
