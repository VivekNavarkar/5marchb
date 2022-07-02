package basics;

import access_Modifire_8.ProtectedModifire;

public class MyFirstProgram extends ProtectedModifire //single Inheritance
{

 public static void main(String[] args) 
 {
	// protected modifire scope with in package but it access other package by using inheritance Method	
		
		MyFirstProgram pm = new MyFirstProgram ();
		pm.modifire();
		System.out.println(pm.z);
 }

}
