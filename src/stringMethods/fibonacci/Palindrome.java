package stringMethods.fibonacci;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "caa";
		String name2="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			name2+=name.charAt(i);
//			System.out.println(name2);
		}
		System.out.print(name.equals(name2));
	}
}