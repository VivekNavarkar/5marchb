package inheritance_7;

//hierarchical_inheritance- multiple sub class extend proerties from one super class
public class Mother 
{
public static void main(String[] args) 
{
	Doughter1 d = new Doughter1();// creat object for one class
	d.look(); // call own method/properties
	d.love(); //call super class method/properties
	
	Doughter2 d1 = new Doughter2();// creat object for second class
	d1.nature(); // call own method/properties
	d1.love();  //call super class method/properties
}

public void love()
{
 System.out.println(" mother give love to doughters "); 
}
}

class Doughter1 extends Mother
{
 public void look() 
 {
 System.out.println(" doughter1 extends mother look");
 }
}
class Doughter2 extends Mother
{
 public void nature()
 {
	 System.out.println("doughter2 extends mother nature");
 }
}