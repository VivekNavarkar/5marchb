package interface12;

public class Car implements Honda
{  public static void main(String[] args) 
{
	 Car c= new Car();
	 c.dream();
	 c.honda();
}

	@Override
	public void dream()
	{
	   System.out.println("My dream car");
		
	}

}
