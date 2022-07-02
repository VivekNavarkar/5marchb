package string15;

public class StringandArray 
{

  public static void main(String[] args)  
  {
// used of concat method--it is used to connect the two String and Return Type is String
	  String a="Vivek ";
	  String b= "Navarkar";
	  System.out.println(a.concat(b));// single used 
	  System.out.println(a.concat(" is good boy "));
	  String c= a.concat(b);// for future used we creat reference variable
	  System.out.println(c);
 // used of Indexof Method-it is used to check starting index of char,RT int
   System.out.println(b.indexOf('a'));
   System.out.println(b.lastIndexOf('a'));//its shoaw the last index of Char
   
   System.out.println(b.indexOf('a', 2));// it is used when we have  multiple same char in string
   
  //used of replace method.- it is used to replace the one char to other char,RT is String
   System.out.println(b.replace('a', ' '));
   System.out.println(b.replace("ar", "ss"));// it is used to replace same seqence avl in String 
   
  // it is used to creat mirror image of string 
   StringBuilder s1 = new StringBuilder(" vivek ");
   System.out.println(s1.reverse());
   
   // spilt -- it is used to convert the one string to number of string
   String S2 = "Suhani_Mohanrao_Hazare";
    String S3 ="_";
    String S4[]=S2.split(S3);
    System.out.println(S4[0]);
    System.out.println(S4[1]);
    System.out.println(S4[2]);
   
  }

}
