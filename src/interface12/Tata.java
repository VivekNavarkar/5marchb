package interface12;

public interface Tata extends Honda // 
{

	 void harier();// incomplet method
	 
	 default void punch()// complet method
	 {
		 System.out.println("My new car ");
	 }
	 default void nano()/* in interface we should declare the abstract method into complete method
	                             by using default/static keyword in front of method name*/
	 {
		System.out.println(" tata nano car"); 
	 }

}
