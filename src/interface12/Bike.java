package interface12;

public class Bike implements Honda
{   public static void main(String[] args)
 {
	Bike b =new Bike();
	b.dream();
	b.honda();
 }


	@Override
	public void dream() 
	{
		System.out.println("My dream bike");
		
	}

}
