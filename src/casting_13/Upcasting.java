package casting_13;

public class Upcasting
{  
   public static void main(String[] args) 
   {
	 /*  Father f = new Father();// create the obj of Super Class
	          f.bike();
	          f.car();
	   Son s = new Son ();//  create obj of sub class
	       s.bike();
	       s.mobile();*/
	    // now create the object for upcasting, we only call same method of sub class extends from super class,
	    //we cant call own method of sub calss
	       
	        Father s1 = new Son();                                                                                                                                                                                                    
	        s1.bike();
	        s1.car();
	        
	        
	       
   }

}
