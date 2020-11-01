package Polymorphism;
//SuperKeyword=>Is used to refer immediate parent class object.

/*Usage of Java super Keyword
1)super can be used to refer immediate parent class instance variable.
2)super can be used to invoke immediate parent class method.
3)super() can be used to invoke immediate parent class constructor.
*/

public class SuperKeyword {
	
	static int id;
	static String Name;
	
	SuperKeyword(int id,String name){//constructor
		this.id=id;
		this.Name=name;
	}
}

class emp extends SuperKeyword{
	static float sal;
	
	emp(int id, String name,float sal) {//constructor
		
		super(id, name);//reusing parents constructor
		
		this.sal=sal;
	}
	
	public   void display() {//display method
		
		System.out.println(id+" "+ Name +" "+sal+" ");
	}
}

class SuperKeywordTest {
	
	public static void main(String[] args) {
		
		emp e1=new emp(1,"abc",45000f);  
		
		e1.display(); 
		
		
	}
}

//1.super is used to refer immediate parent class instance variable.
//2.super can be used to invoke parent class method
//3.super is used to invoke parent class constructor.