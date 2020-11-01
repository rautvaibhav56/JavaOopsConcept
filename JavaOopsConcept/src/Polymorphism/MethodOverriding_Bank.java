package Polymorphism;
//MethodOverriding=> same method name , same parameters but different impl
//Also known as Run time polymorphism 

public class MethodOverriding_Bank {
	
	public static int interestRate() {
		
		return 0;
		
	}
}

class SBI extends MethodOverriding_Bank{
	
	public static int interestRate() {
		return 8;
	}
}

class ICCI extends MethodOverriding_Bank{
	public static int interestRate() {
		return 7;
	}
}

class BOI extends MethodOverriding_Bank{
	
	public static int interestRate() {
		return 11;
	}
}

class Test{
	
	public static void main(String[] args) {
		
		System.out.println("interestRate SBI:"+SBI.interestRate());
		
		System.out.println("interestRate ICCI:"+ICCI.interestRate());
		
		System.out.println("interestRate BOI:"+BOI.interestRate());
		
		
	}
	
}