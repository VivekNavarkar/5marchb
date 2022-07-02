package polymorphism11;

public class MethodOverRiding 
{   /* Accquring the super class method into sub class by extends keywords and changing 
	 defination according to subclass specifiation is called Method Over riding   */ 

	public static void main(String[] args) 
	{
		//now call the same methods by creating obj of both class
            FatherSuper f = new FatherSuper();// creat object of father class
		            Son s = new  Son();      // creat obj of sub class
                        s.money();          // change sub class specification 
                        f.money();         // call super class method 
                        
	
	}

}
