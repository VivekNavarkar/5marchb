package method_type_2;

public class RegularNonStaticMethod {

 public static void main(String[] args) 
 {
		
   // call non static method from same class-- first creat object then called the object
   // classname obj name = new classname();
	  RegularNonStaticMethod rnsm = new RegularNonStaticMethod ();// 1- obj creation
   // objname.methodname();
		rnsm.add(); // 2- call the obj
		rnsm.friend();
   // call non static method from other class 
   // ClassNameofOtherClass objname = new ClassNameofOtherClass();
		RegularStaticMethod rsm =new RegularStaticMethod();
		rsm.div();
		rsm.result();
 }
  public static void mul()// static method 
  {
  int a=200;
  int b=300;
  int mul= a*b;
  System.out.println("multification is " +mul);
  }
  public static void name()
  {
	String name="vivek navarkar";
	System.out.println("My name is" +name);
  }
  public void add()// nonstatic method 
   {
	int a=20;
    int b=20;
	int sum =a+b;
	System.out.println("the sum of both is "+sum );
   }
  public void friend() 
  { 
	boolean friend=true;
    System.out.println("Akshay is my best friend? ans-->"+friend);
  }
  
}
