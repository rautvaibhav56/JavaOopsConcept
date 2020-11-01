package Polymorphism;

/*Rules for Java Method Overriding
1)The method must have the same name as in the parent class
2)The method must have the same parameter as in the parent class.
3)There must be an IS-A relationship (inheritance).*/

//Java method overriding is mostly used in Runtime Polymorphism. 


public class MethodOverriding_Vehicle {
	
	public static void run() {
		
		System.out.println("Running.........");
	}

}

class Bike extends MethodOverriding_Vehicle{
	
	
	  public static void run() {
	  
	  System.out.println("Running safely..............."); 
		  }
	 	
	public static void main(String[] args) {
		
		MethodOverriding_Vehicle.run();
		
		Bike.run();

	}
}