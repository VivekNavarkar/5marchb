package access_Modifire_8;

public class DefaultModifire
{ 
  
 public static void main(String[] args)
  
 {  // call non static method by creating obj
	 PrivateUse pu = new PrivateUse();
   //pu.modifire1(); cant call the private modifire method in other class
     pu.modifire2();// call default modifiire method from other class
     pu.modifire3();// call public modifire method from other class
     pu.modifire4();
    // call global variable--objname.GVname
    // System.out.println(pu.a); cant call the private GV in other Class
     System.out.println(pu.b);// call default Global Variable from other class
     System.out.println(pu.c);// call  public Global Variable from other class
		
 } 
 
 

}
