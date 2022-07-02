package interface12;

public class ImplementClass2<tata> implements Tata,Kia
{
public static void main(String[] args) 
{

	ImplementClass2 ii =new ImplementClass2();
	ii.harier();
	ii.kiasonet();
	ii.punch();
	ii.nano();
	ii.honda();

}

@Override
public void kiasonet()// completed the incopmlete method in imlementionclss2 
{
	System.out.println("New car of kia");
	
}

@Override
public void harier()
{
	
	System.out.println("clasic car of tata");
}
public void punch()
{
	Tata.super.punch();
	Kia.super.punch();
}

@Override
public void nano()
{
	Tata.super.nano();// calling method of one super class
	Kia.super.nano();// calling method of second super class
}

@Override
public void dream() 
{
	// TODO Auto-generated method stub
	
}
}
