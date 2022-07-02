package this_kw9;

public class This_Use
{
    // this keyword is use to accsess the global variable from SAME/CURRENT, Class when Global and local variable name is same
	//  this is cant used for static method(context),only used for non static method
	int dhoni=7;// non static global variable 
	char gender='M';
	static int sachin=10; // static Global Variable
	static String uv= "12";
	
			
	public static void main(String[] args)
	{
	  This_Use t= new  This_Use(); //create obj of non static method
	           t.info();// call the ns method
    }
	
	public void info()// non static  method is create for utlisation of variable
	{
	 int virat= 18; // local variable
	 System.out.println("virat jersey number is "+virat);// call local variable

	 System.out.println("dhoni jersey number is "+this.dhoni);// calling non static GV using this Keyword
	 System.out.println("Gender of dhoni is "+this.gender);//calling non static GV using this Keyword
	 System.out.println("sachin jresey number is "+this.sachin);//calling  static GV using this Keyword
	 System.out.println("uv fastest 50 in "+this.uv+ " bolls");// calling  static GV using this Keyword
	}
	

}
