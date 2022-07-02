package array_16;

public class ArrayStudy 
{

  public static void main(String[] args)
  {
		String name[]=new String[5];
		name[0]="Vivek";
		name[1]="snehal";
		name[2]="maruti";
		name[3]="suhani";
		name[4]="rajesri";
     System.out.println(name);
    for(int i=4;i>=0;i--) 
    {
    	System.out.println(name[i]);
    }
    System.out.println(name[4]);
    System.out.println(name[3]);
	
	
	{
	char grade[]=new char[5];
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	System.out.println(grade[4]);
	for(int i=0;i<=4;i++) 
	{
		System.out.println(grade[i]);
	}
	
	}	
  }
}
