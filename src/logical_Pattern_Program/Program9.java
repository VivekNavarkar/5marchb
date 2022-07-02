package logical_Pattern_Program;

public class Program9 {

	public static void main(String[] args)
	{
		
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
// total row =9;total column=5;initial star 1--> increesed upto row 5;-->star--, than decresed upto row 9;-->star++
		
				int star=1;
				
				for(int i=1;i<=9;i++)// outer for loop for row
				{
					for(int j=1;j<=star;j++)// inner for loop for column
					{
						System.out.print("*");
					}
					System.out.println();// to print next line
					if(i<5)// condition star increse upto row 5
					{
						star++;
					}
					else// otherwise star is decresed
					{
						star--;
					}
				}
	}

}
