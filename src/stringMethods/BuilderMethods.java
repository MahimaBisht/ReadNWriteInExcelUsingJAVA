package stringMethods;

public class BuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mahima";
		System.out.println(s.charAt(0));
//		for(char c : s) {
//			System.out.println(c);
//		}
		StringBuilder str = new StringBuilder("stringMethods");
		StringBuilder str2 = new StringBuilder("stringmethods");
		System.out.println(str.reverse());
		
		System.out.println(str.reverse().substring(4).length());
		System.out.println(str);
		System.out.println(str.capacity());
		System.out.println(str.hashCode());
		System.out.println(str.equals("stringMethods"));
		System.out.println(str.compareTo(str2));
		System.out.println(str.replace(1, 5, "mahi"));
		System.out.println(str);
		System.out.println(str.subSequence(3, 8));
		System.out.println(str.replace(3, 5, "nuiui"));
		str.delete(3, 6);
		System.out.println(str);
	}
}
