package java8;

public class overloading extends overiding {

	public void print() {
		System.out.println("print1");
	}
	public void print(String var) {
		System.out.println("print2");
	}
	
	public static void main(String[] args) {
		
		overiding obj=new overloading();
		obj.print();
		
		obj=new overiding();
		obj.print();

	}

}
