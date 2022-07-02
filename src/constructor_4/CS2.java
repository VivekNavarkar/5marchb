package constructor_4;

public class CS2 
{
	
// Global Variable Declaration in the class
	int a;
	int b;
	int c;
	int d;
	float p;
	float q;

   public static void main(String[] args) 
   {
		// TODO Auto-generated method stub
              CS2 c2 = new CS2();
              c2.sum();
              CS2 c3 = new CS2(100);// give x=10 in ()
              c3.sum();
              CS2 c4= new CS2(200,200); //give x=200,y=200
              c4.sum();
              CS2 c5 = new CS2(100,200,300);//  give x=100,y=200,z=300
              c5.sum();
              CS2 c6 =new CS2(10,20,30,40);
              c6.sum();
              CS2 c7= new CS2(25.25f,25.25f);
              c7.mul();;
            		  
              
   }	
 // creat constructor without parameter
   CS2()
    {
		a=10;
	    b=20;
		c=30;
	}
// creat constructor with parameter
  public CS2(int x) // define single constrctor in () with local  variable declaraion
   {	 
	  a=x;// variable intilazation
   }
  public CS2(int x,int y)//DOUBLE 
	   {
		 a=x;
		 b=y;
	   }
  public CS2(int x,int y,int z)//TRIPLE 
	   {
		 a=x;
		 b=y; 
		 c=z;	
	   }
  public CS2(int x,int y,int z,int u)//4th 
      {
		 a=x; b=y; c=z;d=u;
      }
  public CS2(float j,float k)
  {
	  p=j;
	  q=k;
	  
  }
  public void mul()
  { 
	  float mul=p*q;
	  System.out.println("the mul is "+mul);
  }
  public  void sum()// creat method for callig constructor
  {  
	 int sum=a+b+c+d;
	 System.out.println("the sum is "+sum);
  }
  
}
