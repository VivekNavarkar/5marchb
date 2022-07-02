package inheritance_7;

public class GrandSon extends Son
{
public static void main(String[] args) 
{   //Multilevel inheritance
	
	GrandSon gs =new GrandSon();
	gs.cycle();// calling method from own/child class
	gs.toy();
	gs.bike();// calling method/prop from parents/super class 
	gs.home();// calling method/prop from supermost/super parent class
	gs.car();
 
	
}
	
  public void cycle()
  {
	   System.out.println("GrandSon CYCLE");
  }
  public void toy()
  {
	   System.out.println("GrandSon TOYs");
  }
}
