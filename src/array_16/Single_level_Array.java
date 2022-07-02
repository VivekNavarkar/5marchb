package array_16;

public class Single_level_Array {

	public static void main(String[] args)
	{
		char grade[]=new char[5];// array with new keyword is call static obj creation
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		System.out.println(grade[4]);
		for(int i=0;i<=4;i++) // mxm index= length-1---5-1=4
		{
			System.out.println(grade[i]);
		}
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}

	}

}
