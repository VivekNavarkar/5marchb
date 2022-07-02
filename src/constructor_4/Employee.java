package constructor_4;

public class Employee 
{

 public static void main(String[] args)
 {
    // call the non static  of that class
	 
	HR_Portal SachinT = new HR_Portal();
// datatype  varaiable = Memory asm for obj  / Method 
         // now variable initilazation
	SachinT.Emp_name="sachin tendulkar";
    SachinT.Emp_id =10;
    SachinT.Emp_sal= 1.2F;
    SachinT.Emp_position="10000";
    SachinT.Emp_gender= 'M';
    SachinT.empinfo();// call the method
    
  HR_Portal ViratK = new HR_Portal(); 
  ViratK.Emp_name="Virat Kohli";
  ViratK.Emp_id =18;
  ViratK.Emp_sal= 1.2F;
  ViratK.Emp_position="10000";
  ViratK.Emp_gender= 'M';
  ViratK.empinfo();
 
  
	
}
}
	
