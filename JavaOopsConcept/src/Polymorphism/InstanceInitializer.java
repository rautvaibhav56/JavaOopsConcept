package Polymorphism;
//InstanceInitializer=>It is used to initialize the instance data member

public class InstanceInitializer {
	int speed;
	
	InstanceInitializer(){
		System.out.println("speed is"+speed);
	}
	
	{speed=200;}//instance initializer block
	

	public static void main(String[] args) {
		new InstanceInitializer();

	}

}
// What is the use of instance initializer block while we can directly assign a value in instance data member? 
//=> to perform some operations while assigning value to instance data member e.g. a for loop to fill a complex array or error handling etc.

//There are three places in java where you can perform operations:
//1)method
//2)constructor
//3)block

/*
 * Rules for instance initializer block : There are mainly three rules for the
 *instance initializer block. They are as follows:
 *a.The instance initializer block is created when instance of the class is created. 
 *b.The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
 *c. The instance initializer block comes in the order in which they appear.
 */