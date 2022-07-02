package java_program;

public class swapping {
// swapping--swapping means to interchange the two values. ie if a=10 & b=20 than swap--a=20 & b=10.
	public static void main(String[] args)
	{ 
		int a=10;
		int b=20;
		System.out.println("before swapping values are .."+a+" "+b);
	//Logic 1.by using third variable 
	    int c=a;// c=10,
	        a=b;// a=20
	        b=c;// b=10 
	    System.out.println("After swapping values are .."+a+" "+b);
		
   /*Logic 2.by using + & 
	    a=a+b;// 10+20=30
	    b=a-b;//30-20=10
	    a=a-b;//30-10=20
	    System.out.println("After swapping values are .."+a+" "+b);*/
	}

}
