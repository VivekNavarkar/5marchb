package interface12;

public interface Kia 
{
 void kiasonet();// incomplet method 
 
 default void punch()// complet method
 {
	 System.out.println("tata luanch a new car");
 }
 default void nano()// copmlete method
 {
	 System.out.println(" tata chip car ");
 }
}
