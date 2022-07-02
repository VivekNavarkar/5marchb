package logicalProgram;

import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{  
	//logic 1.creat Scanner Class for user input.
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter String Value ");// for user input in console.
        String   s = sc.next(); // calling scanner method next for String with scanner object sc.
        System.out.println("Given String Value is "+s);
        String rev = " ";// create ref variable for string for reverse value.
    
    // for reverse string we used for loop
        for(int i=s.length()-1;i>=0;i--)
        {
        	 rev=rev+s.charAt(i);
       // reverse Vivek(01234)---keveV(43210), when i=4-->rev= (rev+K)= ""+k =K
                                            // when i=3-->rev= k+e=ke 
                                            // when i=2-->rev= ke+v=kev
                                            // when i=1-->rev= kev+i=kevi
                                            // when i=0-->rev= kevi+V= kevik

        }
        System.out.println("Reverse String Value is "+rev);
        
        
    //2 logic 2
        String v = "Vivek";
        for(int i=v.length()-1;i>=0;i--)
        {
        	System.out.print(v.charAt(i));
        }
	}
} 