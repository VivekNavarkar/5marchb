package controalStatment_5;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch is multiple choise decision making statement,
	//	it is used when we want to select only one case out of multiple cases.
// week day
		String days="sun";
		switch(days)//(condition statement).
		{
		  case "mon":System.out.println("monday date is 21 march");
		  break;
		  case "tue":System.out.println("tue date is 22 march");
		  break;
		  case "wed":System.out.println("wed date is 23 march");
		  break;
		  case"thu":System.out.println("thu date is 24 march");
		  break;
		  case"fri":System.out.println("fri date is 25 march");
		  break;
		  case "sat":System.out.println("sat date is 26 march");
		  break;
		  case "sun":System.out.println("sun date is 27 march");
		  break;
		  default :System.out.println("default days");
		}
		
		
	}

}
