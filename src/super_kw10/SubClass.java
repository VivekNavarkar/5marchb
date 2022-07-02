package super_kw10;

public class SubClass extends SuperClass {
	int a = 25;// global variable of sub class

	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.display();

	}

	public void display()// creat NSM for utilazation of Variable
	{
		int b = 50;// local variable of sub class
		System.out.println("calling local variable of sub class " + b);
		System.out.println("calling G V of Sub Class by using this.GVname  " + this.a);
		System.out.println("calling G V of Super class By using Super.GVname " + super.c);
		System.out.println("calling static GV of Super class " + super.colur);
	}

}
