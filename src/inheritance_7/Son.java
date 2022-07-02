package inheritance_7;

public class  Son extends Father
{  
 
public static void main(String[] args) 
{  
	//singal leval inheritance
	
  Son s = new Son();// obj creat of sub/child class
      s.bike();// calling own class method/ properties
      s.home();// calling Parents/super class method/prop
      s.car(); //calling Parents/super class method/prop
      
}
 public void bike()
 {
	System.out.println("Son BIKE");
 }
}
