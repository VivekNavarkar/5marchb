package method_type_2;

public class AssignmentsOnParameter {
public static void main(String[] args) {
	
	// Parameter is used for non static method
// 1) without parameter
		AssignmentsOnParameter v = new AssignmentsOnParameter();
		v.batchinfo();
//2) with parameter
		AssignmentsOnParameter vv = new AssignmentsOnParameter();
		vv.batchinfo("Ravindra Dhobi", "Jalgoan",'M', 10, 77, 86.56f);
		vv.batchinfo("Akshay Chaudhari", "Jalgoan", 'M', 10, 777, 84.55f);
        vv.batchinfo("Kishor","Jalgoan", 'M',10, 7777, 82.02F);
        vv.Myinfo("Vivek", 27, 5.6f, 'M');
        vv.Myinfo("UMESH", 22, 5.8F, 'M');
}
//1) without parameter--> variable dec,initilazation and usage is done in method block{}
	public void batchinfo()
	{
		String name ="vivek Navarkar";
		String dist= "Jalgoan";
		char gender = 'M';
		int batch= 10;
		int rollnum = 07;
		float percentage= 86.91f;
	System.out.println("===================================================");	
		System.out.println("My Name is " +name);
		System.out.println("My dist name is "+dist);
		System.out.println("My Gender is "+gender);
		System.out.println("My Batch is "+batch);
		System.out.println("My roll num is "+rollnum);
		System.out.println("My percentage is "+percentage);
	System.out.println("===================================================");	
	}
//2) with parameter-->
//-->Variable Declaration in the Method bracks (),variable inilazation in main method when method is call,and usage in method Block{}.
	public void batchinfo1(String name,String dist,char gender,int batch,int rollnum,float percentage) //(variable declaration in )
	{
		    System.out.println("My Name is " +name);
			System.out.println("My dist name is "+dist);
			System.out.println("My Gender is "+gender);
			System.out.println("My Batch is "+batch);
			System.out.println("My roll num is "+rollnum);
			System.out.println("My percentage is "+percentage);
	System.out.println("===================================================");
	}
	public void batchinfo2(String name,String dist,char gender,int batch,int rollnum,float percentage)
	{
            System.out.println("My Name is " +name);
			System.out.println("My dist name is "+dist);
			System.out.println("My Gender is "+gender);
			System.out.println("My Batch is "+batch);
			System.out.println("My roll num is "+rollnum);
			System.out.println("My percentage is "+percentage);
	System.out.println("===================================================");
	
	}
	public void batchinfo(String name,String dist,char gender,int batch,int rollnum,float percentage) 
	{
		    System.out.println("My Name is " +name);
			System.out.println("My dist name is "+dist);
			System.out.println("My Gender is "+gender);
			System.out.println("My Batch is "+batch);
			System.out.println("My roll num is "+rollnum);
			System.out.println("My percentage is "+percentage);
	System.out.println("===================================================");
	}
	public void Myinfo(String name,int age,float hight,char gender)
	{
		System.out.println("My name is "+ name);
		System.out.println("My age is "+age);
		System.out.println("My hight is "+hight);
		System.out.println("My gender is "+gender);
	System.out.println("===================================================");
	}
		
}


