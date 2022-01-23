package dsNAlgo.sorts;

import java.time.LocalTime;
import java.util.Scanner;

public class binarySearch {

	float findMe;
	float[] findInMe;
	float among;
	
	binarySearch(float hidden, float[] ground, float players){
		findMe=hidden;
		findInMe=ground;
		among=players;
	}
	
	private void search() {
		float first=0,last=among-1;
		float mid;
		
		while(last>first+1) {
			mid=(first+last)/2;
			if(mid==findMe || findMe==first+1 || findMe==last+1) {
				System.out.println("mid, "+(first+1)+", "+(last+1));
				break;
			}
			else if(mid<findMe){
				first=mid;
				System.out.println("<mid, "+(first+1)+", "+(last+1));
			}
			else if(mid>findMe){
				last=mid;
				System.out.println(">mid, "+(first+1)+", "+(last+1));
			}
		}
		
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		float hidden = scan.nextFloat();
		float[] array = new float[20000];
		int pos=0;
		LocalTime timenow = LocalTime.now();
		
		while(pos<20000) {
			array[pos]=pos+1;
			pos++;
		}
		
		binarySearch bn = new binarySearch(hidden,array,array.length);
		
		System.out.println(timenow.now());
		bn.search();
		System.out.println(timenow.now());
		scan.close();
	}
}
