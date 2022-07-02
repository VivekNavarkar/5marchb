package constructor_4;

import globalAndLocalVariables_3.GlobalAndLocalVariable;

public class GbPractise {
	String name="vivek";
	String surname ="navarkar";
	static long num=9503887980l;
	
	
public static void main(String[] args)
{// TODO Auto-generated method stub
     GbPractise v=new GbPractise(); 
	            v.fullname();
		           mobnum();
	// calling non static GV from same class	           
    System.out.println("calling GV from same class  "+v.name);
    //calling static GV from same class
    System.out.println("Calling static GV same class "+num);
	// calling static GV from other class	
    GlobalAndLocalVariable ob = new GlobalAndLocalVariable();
		                   ob.add();	
}
 public void fullname()  
  {
		String sum= name+surname;
		System.out.println("My full name is "+sum);
  } 
public static void mobnum()
 {
       long sum = num+1;
       System.out.println("My mobile number is "+sum);
 }
	
}
