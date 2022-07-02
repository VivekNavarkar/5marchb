package controalStatment_5;

public class ElseIF {
public static void main(String[] args) {
	
    // if marks grater than or equal to 75--dist
	// if marks grater than or equal to 66---first class
	// if marks grater than or equal to 40--pass
	//if marks are less than 40--fail
	
 int marks=60;

 if(marks>=75)
{
System.out.println("the result is dist");
}
else if(marks>=66)
{
	System.out.println("result is first class");
}
else if (marks>=40) {
	System.out.println("result is pass ");
}
else 
{
	System.out.println("result is failed");
}
	
}
}
