package stringMethods.fibonacci;

public class factRecursive {
	public static int fact(int a) {
		System.out.println("count");
		int factorial=0;
		if(a==1)
			return 1;
		else
			factorial=a*fact(a-1);
		return factorial;
	}
	public static void main(String[] args) {
		int a=5;
		System.out.println(fact(a));
	}
}