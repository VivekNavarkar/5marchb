package interface12;

public class ImplementClass1 implements Myinterface1
{

	public static void main(String[] args) 
	{
		ImplementClass1 i = new ImplementClass1();// creat object
                 i.maruti();// calling complete method of class
                 i.suhani();
                 i.snehal();// calling own method of class
                 System.out.println(a);//calling variable of Myinterface1
	}

	@Override
	public void maruti() // complete the incomplete method of Myinterface1
	{
	 System.out.println("Maruti is my Friend");
	// a=20;  we cant reassign fianal variable
	}
	
	public void suhani()
	{
		System.out.println("suhani is my friend");
	}
	
	public void snehal()// own method of implementClass1
	{
		System.out.println("snehal is my friend");
	}

		
	

}
