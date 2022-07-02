package controalStatment_5;

public class Nested_IfElse {
	
	public static void main(String[] args) {
		String card= "Atm";
		String pin="1234";
		String mainmenu="BI";
		
		if(card=="Atm")
		{
		System.out.println("Enter your pin");
			if(pin=="1234") {
				System.out.println(" show balance and ministatment");
			}
			else {
				System.out.println("Incorrect Pin");
			}
			if(mainmenu=="BI") {
				System.out.println("plese check your balence is 40000");
				
			}
			else {
				System.out.println("plese select proper options");
			}		
	}
		else {
			System.out.println("Plese check your card is insurt");
			
			
			
			
			
		}
		 
		
		
		
	}
	
	

}
