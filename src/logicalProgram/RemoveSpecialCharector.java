package logicalProgram;

public class RemoveSpecialCharector {

	public static void main(String[] args) 
	{
		String a="Vivek@";
		System.out.println(a.replace("@"," "));

		String b="Vi@Ve@k@";
		System.out.println(b.replaceAll("[^a-zA-Z]",""));
		
		String c="info@#$%sys#$%";
		System.out.println(c.replaceAll("[^a-zA-Z]",""));           // remove special char by replace all not method[^a-zA-Z]
		System.out.println(c.replace("@#$%","").replace("#$%","")); // remove special char by multiple replace method.
	}

}
