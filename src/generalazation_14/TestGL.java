package generalazation_14;

public class TestGL 
{    static int a=30;
// creat object of every sub class and call the method
	public static void main(String[] args) 
	{  
	 System.out.println("Central Gov Tax is Fix "+a+"%");
     System.out.println("============================");
	 MH m = new MH();
	 m.petrol();
	 m.disel();
	 m.gas();
	 m.mva();
	 System.out.println("=========================");
	 
	 Gujrat g = new Gujrat();
	 g.petrol();
	 g.disel();
	 g.gas();
	 g.bjp();
	 System.out.println("========================== ");
	 
	 Rajsthan rj =new Rajsthan();
	 rj.petrol();
	 rj.disel();
	 rj.gas();
	 rj.congress();
	 System.out.println("==========================");
	}

}
