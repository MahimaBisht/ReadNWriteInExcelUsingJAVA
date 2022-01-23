package dsNAlgo.sorts;

import java.time.LocalTime;
import java.util.Scanner;

public class linearSearch {

	float findMe;
	float[] findInMe;
	float count;
	
	linearSearch(float hidden, float[] array, float players){
		findMe=hidden;
		findInMe=array;
		count=players;
	}
	
	private void search() {
		int flag=0;
		
		while(flag<count) {
			if(findInMe[flag]==findMe) {
				System.out.println("found "+(flag+1));
				break;
			}
			else {
				flag++;
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
		
		linearSearch ln = new linearSearch(hidden,array,array.length);
		
		System.out.println(timenow.now());
		ln.search();
		System.out.println(timenow.now());
		scan.close();
	}
}
