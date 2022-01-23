package patterns;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class MyRegex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s;
		String ptrn4 = "(0?0?[0-9]\\.|0?[1-9][0-9]\\.|1[0-9][0-9]\\.|2[0-4][0-9]\\.|25[0-5]\\.){3}(0?0?[0-9]|0?[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		while(1>0) {
	        try {
	        	s = scan.nextLine();
	        	Pattern.compile(ptrn4);
	        	System.out.println("valid");
	        	System.out.println(s.matches(ptrn4));
	        }
	        catch(PatternSyntaxException p) {
	        	System.out.println(p);
	        }
		}
	}
}
