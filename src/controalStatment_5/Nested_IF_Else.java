package controalStatment_5;

public class Nested_IF_Else 
{
public static void main(String[] args) 
{
	//Nested If Else control Statement is decisin making statment,
	//an  if else statment is iner in the  IF block statment
   // eg- username passward
	// if UN is correct--> Enter Password, else invalid UN.
	// if password is correct--> Login Success, else invalid password
	String Un= "Vivek";
	String PW= "Vivek123";
	
	if(Un=="Vivek")
	{
		System.out.println("username is correct enter pwd");
	
	    if(PW=="Vivek123")
	     {
		   System.out.println("pwd is correct log in succses");
	     }
        else  
         {
           System.out.println("passward invalid");
         }
    }
	else  
	    {
	    System.out.println("Invalid Un");
	    }
}
}

