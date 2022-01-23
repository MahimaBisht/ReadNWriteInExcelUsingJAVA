package java8;

interface AbstractClass {

	public abstract void abstractMethod();
	
}

public class anonymousClass2{
	public static void main(String args[]) {
		//way of defining lambda expression
		AbstractClass obj = ()->System.out.println("hello");
		
		obj.abstractMethod();
	}
}
