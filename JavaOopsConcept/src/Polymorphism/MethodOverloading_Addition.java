package Polymorphism;
//MethodOverloading->same method name but different no of parameters.
//Also known as compile time polymorphism
public class MethodOverloading_Addition {
	
	public static int add(int a,int b) {
		
		return a+b;
		
	}
	
	public static int add(int a,int b ,int c) {
		
		return a+b+c;
		
	}

	public static void main(String[] args) {
		
		System.out.println(MethodOverloading_Addition.add(10,12));
		
		System.out.println(MethodOverloading_Addition.add(10,20,30));
		
	}

}
//==============================================================
// Method Overloading: changing data type of arguments => allowed
//static int add(int a, int b){return a+b;}  
// double add(double a, double b){return a+b;}  
//===============================================================
//why Method Overloading is not possible by changing the return type of method only?=>ambiguity
//static int add(int a,int b){return a+b;}  
//static double add(int a,int b){return a+b;}    =>it gives compile time error: method add(int,int) is already defined in class Adder
//================================================================
//**IMP**Can we overload java main() method?
//Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only.
//===================================================================
// Method Overloading with Type Promotion if matching found
//void sum(int a,int b){System.out.println("int arg method invoked");}//Output:int arg method invoked  
//void sum(long a,long b){System.out.println("long arg method invoked");} 
//===================================================================
// Method Overloading with Type Promotion in case of ambiguity
//void sum(int a,long b){System.out.println("a method invoked");}  
//void sum(long a,int b){System.out.println("b method invoked");}  //Output:Compile Time Error
//==================================================================







