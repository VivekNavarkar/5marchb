package string15;

public class StringStudy {

	public static void main(String[] args)
	{
   //when object creat using without new keyword then memory allocation is in Constant Pool Area
   //duplicate object are not allowed
      String s1= "Vivek";
      String s2= "Vivek";// duplicate object creat but it store in same memory location s1.
      String s3= "ViveK N";
   //when object creat using new keyword then memory allocation is in Non Constant Pool Area
   //duplicate object are allowed
      String m1=new String("Umesh Navarkar");
      String m2 =new String ("Umesh");
      String m3=new String("umesh"); // duplicate object creat but it creat separat memory m3.
       	  
      
  //1 use of length method
      System.out.println("Length of string is "+s1.length());//it is used for only sigle used/Printing satatment.                                    
      int stringLength = s1.length();//stored in reference variable for future used
      System.out.println("length of string is "+stringLength);// used of Reference Variable.
      
      System.out.println(m1.length());
      int n1=m1.length();
      System.out.println(n1);
  //2 used of toUpperCase method--objname.methodname in syso
      System.out.println(m2.toUpperCase());
      String n2=m2.toUpperCase();
  //3 used of toLowerCase method--objname.methodname in syso by using Ref Variable n2.
      System.out.println(n2.toLowerCase());
  //4 use of equals method
   // i == will compare memory locations for same loc--true and for diff loc---false.
    System.out.println(s1==s2); // both s1 and s2 created without using new keyword--true
    System.out.println(s2==s3); //diff loc--false
    System.out.println(s1==m2); /*s1 having memory in constant pool area and m2 having memory in 
                                non constant pool area(both locations are different)--false*/
    System.out.println(m2==m3); // memory is dif loc---false
   //  ii-- equals();
      System.out.println(s1.equals(s2));//seqence of char same 
      System.out.println(m1.equals(m2));//seqence of char diff
      System.out.println(m2.equals(m3));// sequence of char diff LC & UC
  //5 used of equalsIgnorCase(); method  
      System.out.println(m2.equalsIgnoreCase(m3));//not case sensitve -- true
  //6 use of contains();
      // it is used to check contain of the string  name sequentially.
      System.out.println(s1.contains("vek"));
  //7 used of isempty
     // it is used to check the string length if string length is 0--true,more than 0 than--false
      
      String p="";
        System.out.println(p.isEmpty());//true for 0 string contain 
        System.out.println(s1.isEmpty());// false for string contain name vivek
        System.out.println(p.isBlank()); // same as isempty
	}

}
