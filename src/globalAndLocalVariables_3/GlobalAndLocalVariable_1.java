package globalAndLocalVariables_3;

public class GlobalAndLocalVariable_1 
{

   int x=100;// Global non-satic varaible 
   float y=100.25f; 
   static int z= 200;// Globle static Variable
   static int u=200;
   static int v=300;
    
  public static void main(String[] args) 
  {
// method call
	  GlobalAndLocalVariable_1 gvl =new GlobalAndLocalVariable_1();
	  gvl.add();
	  result();
// calling  non static global variable from same class
	System.out.println("Non static Globle Variable is "+gvl.x);// +objname.gvname for nonstatic gv
	System.out.println("Non static GV call "+gvl.y);
	
// calling static variable from same class
	System.out.println("static Globle variable is "+z);//+gv for static gv
	System.out.println("static Globle variable is "+u);
	System.out.println(" static GV valu v is "+v);
	
// calling  non static global variable from another class-- creat obj of that class
	GlobalAndLocalVariable gl = new GlobalAndLocalVariable();
	System.out.println("Non static G V From another Class "+gl.a);
	System.out.println("Non static G V From another Class "+gl.b);
	
	
//calling static variable from oter class--
//"printing statment"+ classname.GlobleVaraiblename
	System.out.println(" static G variable from another class "+GlobalAndLocalVariable.c);
	System.out.println(" static G variable from another class "+GlobalAndLocalVariable.d);
	System.out.println("satic GV from other class "+GlobalAndLocalVariable.e);
	
  }
  public void add() 
  {
	  float sum=x+y;
	  System.out.println("the sum is"+sum);
  }
  public static void result() 
  {
	  int sum = z+u;
	  System.out.println("the sums is"+sum);
  }
  
  
}