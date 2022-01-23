//============================================================================================
//=========================java code==========================================================

//to find the smallest and largest "substrings" of given "length(k)" from the given "string(s)"
//problem statment by : hackerrank
//solved by			  : mahima bisht
//dated 			  : 27 sept 2020

//============================================================================================

package stringMethods;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] strArr = new String[s.length()-(k-1)];
//        String temp = "";
        
        for(int i=0;i<strArr.length;i++) {
        	strArr[i]=s.substring(i, i+k);
        }

        System.out.print("\n");
//        for(int i=1;i<strArr.length;i++){
//            for(int j=0;j<strArr.length-i;j++){
//                if(strArr[j].compareTo(strArr[j+1])>0){
//                    temp = strArr[j];
//                    strArr[j]=strArr[j+1];
//                    strArr[j+1]=temp;
//                }
//                for(String str:strArr) {
//                	System.out.print(str+" ");
//                }
//                System.out.println(" ");
//            }
//        }
        Arrays.sort(strArr);
        smallest = strArr[0];
        largest = strArr[strArr.length-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        
        scan.close();
        System.out.println("abcb".compareTo("ab b"));
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}