package logicalProgram;

public class ArmStrong_Number
{

	public static void main(String[] args) 
	{
	// How to identify armStrong number-- armstrong number means to LHS value = RHS sum of every digits cube is equal
	// eg- 371 = 3^3+7^3+1^3= 9+343+1  =371--->its armstrong number.
	//     515 = 5^3+1^3+5^3= 125+1+125=251--->its not armStrong Number.
		int a=371;// given value 
		int num=0;// take ref variable for addition;
		for(int i=a;i>0;i=i/10)// 371/10 =37 %1
			                     //37/10 =3  %7
			                     //3/10  =0  %3
		{   
			int num1 =i%10;
			num=num+(num1*num1*num1);
			// 0+(3*3*3)=27
			//27+(7*7*7)=370
			//370+(1*1*1)=371.
		}
		System.out.println("orignal number is "+a);
		System.out.println("addition of number is "+num);
		if(a==num)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Given number is not armstrong number");
		}
	}

}
