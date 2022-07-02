package logical_Pattern_Program;

public class Program1 {

	public static void main(String[] args)
	{ 
// 1.how to print star in one column.
		//*
		//*
		//*
		//*
        int a=4;
        for(int i=1;i<=4;i++) 
        {
        	System.out.println("*");
        }
 System.out.println("====================================================");    
//2. how to print star in squre with space.       
      //* * * * *
      //* * * * *
      //* * * * *
      //* * * * *
      //* * * * *
  // first find total row and column in the given problem
  // row= 5 for row used outer for loop , column = 5 for column Used inner for loop.
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        	
        }
System.out.println("===================================================="); 
	}

}
