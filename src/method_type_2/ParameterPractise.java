package method_type_2;

public class ParameterPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ParameterPractise f=new ParameterPractise();
	f.family("vivek", 27, 5.6f, 50.5f, 9503887981l);
	f.family("umesh", 22, 5.8f, 52.5f, 9561751386l);
	f.family("yogesh", 20, 5.4f, 53.5f, 123456786L);
	

	f.marks(100, 100, 100, 100, 100);
	f.marks(86, 80, 50, 70, 66);
	}
// with parameter non static method
	
	public void family(String name,int age,float hight,float wight,long number)// variable declaration
	{ 
	System.out.println("======================================");
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
		System.out.println("my hight is "+hight);
		System.out.println("my wight is "+wight);
		System.out.println("my mobile number is "+number);
	System.out.println("======================================");
	
	}
	public void marks(int a,int b,int c,int d,int e)
	{
		int umesh =a+b+c+d+e;
		
		System.out.println("the total marks of umesh is "+umesh);
	}
	
	}

