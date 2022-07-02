package controalStatment_5;

public class Nested {

public static void main(String[] args) {
	//eg.-on off butten
	String plug="on";
	String power="on";
	
	if(plug=="on") // 1 condition
	 {
		System.out.println("the tube is on");//excution
		
	    if(power =="on") {// 2 condition
		   System.out.println("the power is on");
	     }
	    else 
	     {
		   System.out.println("the power is off");
	     }
     }
	else
	{
		System.out.println("the tube is off");
	}
}
}
		   
	   
	



