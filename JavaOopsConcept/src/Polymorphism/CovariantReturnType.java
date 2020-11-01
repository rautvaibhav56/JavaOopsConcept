package Polymorphism;
//Both methods have different return type but it is method overriding. This is known as covariant return type.
//? not getting this
public class CovariantReturnType {
	
	CovariantReturnType get() {
		
		return this;
	}
	
	public void n() {
		System.out.println("hiiiii");
	}
}

class B{
	
	B get() {
		return this;
		
	}
	
	public static void m() {
		
		System.out.println("covariant return type");
	}
	
	public static void main(String[] args) {
	
		B.m();
		
		new CovariantReturnType().get().n();//Anonymous object 
	}

}