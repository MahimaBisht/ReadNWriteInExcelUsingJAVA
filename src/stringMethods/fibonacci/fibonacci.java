package stringMethods.fibonacci;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		int first=0,sec=1,third;
		
		System.out.println("enter number of elements required in fibonacci series: ");
		Scanner scan=new Scanner(System.in);
		int s = scan.nextInt();
		int count=0;
		while(count<s){
			System.out.println("first: "+first);
			sec=sec+first;
			first=sec-first;
			s--;
		}
		scan.close();
	}

}
