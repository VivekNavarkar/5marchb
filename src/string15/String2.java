package string15;

public class String2 
{

	public static void main(String[] args)
	{
// 8 úsed of charAt() method--it is used to check the charector index number of any String.  
	String city="Pune";	
	System.out.println(city.charAt(3));
// 9 used of endsWith();-- it is used to check end index of the string return type is boolean.
	String e="Maruti";
	System.out.println(e.endsWith("ti"));// true
	System.out.println(e.endsWith("ut"));// false
//10 used of startWith();--- it is used to check start index of the string RT is boolean
	System.out.println(e.startsWith("M"));// true
	System.out.println(e.startsWith("m"));// false case sensitve
//11 used of substring--- it is used  to calling the string from by given index number of the string.
	String u="Vivek Madhukar Navarkar";
	System.out.println(u.substring(14));
    // calling the string from start point and end point.
	System.out.println(u.substring(6, 14));
//12 used of concat method--It is used to connect/joint the two string. RT type is String.
	String a = "Vivek ";
	String b = "Navarkar";
	System.out.println(a.concat(b));//Vivek Navarkar
	System.out.println(a.concat("Madhukar Navarkar"));//--Vivek Madhukar Navarkar
	String c= a.concat("Madhukar Navarkar");// creat Ref object
	System.out.println(c);
// 13 used of Indexof -- It is Used to check the index number of any String,
	  //it is used for only First occerance number of the  string.Return type is int 
	String v ="Tamaswadi";
	System.out.println(v.indexOf('a'));//ans--1.
 // 14 used of lastIndexof -- It is Used to check the index number of any String,
 //it is used for only last occerance number of the string.Return type is int 
	System.out.println(v.lastIndexOf('d'));//ans--6.
	System.out.println(v.indexOf('a',2));//--it is used to check the multiple char index in the string--2
// Study of Replace Method--It is used to replace the charector of the String .RT is String 
	String state= "Maharashtra";
	System.out.println(state.replace('a','b'));   // a replace b 
	System.out.println(state.replace("ra","mn")); // ra replace mn
	
	String DreamCompany = "@##info&&&$%#sys";// print only infosys name
	System.out.println(DreamCompany.replace("@##&&&$%#"," "));
	System.out.println(DreamCompany.replace("@##&&&$%#", " "));
	

	
	
	
	
	}

}
