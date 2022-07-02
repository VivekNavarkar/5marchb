package array_16;

public class Arrayss {

	public static void main(String[] args) 
	{
	 int arr[]= {1,2,3,4,5,6,7,8};// without new kw,dynamic object creation
      System.out.println(arr.length);//find length
      
      for(int i=0;i<=arr.length-1;i++) 
      {
    	  System.out.println(arr[i]);
      }
      for(int i=arr.length-1;i>=0;i--) {
    	  System.out.println(arr[i]);
      }
	}

}
