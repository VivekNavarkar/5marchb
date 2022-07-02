package logical_Pattern_Program;

public class Program8 {

	public static void main(String[] args) 
	{
		// *****
		// ****
		// ***
		// **
		// *
		// **
		// ***
		// ****
		// *****
// total row =9;total column=5;initial star 5--> decrese upto row 5;-->star++, than incresed upto row 9;-->star--
// initial space is 0
		int star=5;
		int space=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
	}

}
