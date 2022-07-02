package array_16;

public class Multiarray 
{

	public static void main(String[] args) 
	{
		int v [][]= {{1,2},{3,4}};
		
    System.out.print(v[0][0]+" ");
    System.out.print(v[0][1]+" ");
    System.out.println();// println is used for new line 
    System.out.print(v[1][0]+" ");
    System.out.print(v[1][1]+" ");
    System.out.println();
    
    for(int i=0;i<=v.length-1;i++) //for outer loop for row
    {
    	for(int j=0;j<=v.length-1;j++) //for inner loop for column
    	{
    		System.out.print(v[i][j]+" ");
    	}
    	System.out.println();// for new line
    }
    
	}

}
