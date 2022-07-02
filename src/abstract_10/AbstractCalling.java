package abstract_10;

public class AbstractCalling extends ConcreteClass
{

	public static void main(String[] args)
	{
	//creat object for call the non static method for other class	
		AbstractCalling AC =new AbstractCalling();
		                AC.mobile();
		                AC.d2h();
		                AC.licPrem();
		                AC.Ebill();
		                AC.servicetax();
		                
	}

	@Override
	public void licPrem()
	{
	 System.out.println("complete lic premeum pay method");
		
	}
	public void servicetax()
	{
		System.out.println("complete service tax pay method");
	}
	
	

}
