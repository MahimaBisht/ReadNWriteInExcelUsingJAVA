//==================================================================

// problem : create list of maps and iterate over list elements 

//==================================================================
package lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListMethods {

	public static void main(String args[]) {
		
//		=============================================================================================================================
		List<Integer> marks = new ArrayList<Integer>();
		List<Integer> subMarks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(43);
		marks.add(1, 45);
		//practices
		System.out.println("start"+marks.toString());
		System.out.println(marks.subList(0, marks.size()/2).toString());
		System.out.println(marks.toString());
		subMarks= marks.subList(0, marks.size()/2);
		System.out.println("end"+subMarks.toString()+marks.toString());
		
		if(marks.contains(43)==true) {
			
			if(marks.get(1)==45) {
			
				System.out.println("marks contains 43 and 45 is at index 1");
			}
		}
		
		// check if list of names have john as first name
		
		List<String> names = new ArrayList<String>();
		
		names.add("john danver");
		names.add("malon sherif");
		names.add("john himtec");
		
		for(String name : names) {
			
			if(name.contains("john")) {
			
				System.out.println(name);
			
			}
			else continue;
		}

		
//		==============================================================================================================================
		
		
		// L i s t  o f  m a p s
		
		Scanner scan = new Scanner(System.in);
		int s, i= 0;
		String name,age;
		
		Map<String,String> student;
		
		List<Map<String,String>> record = new ArrayList<Map<String,String>>();
		
		s = scan.nextInt();
		
		System.out.println("Num of records : "+ s);

		while(i<s) {
			name = scan.next();
			age = scan.next();
			student = new HashMap<String,String>();
			student.put("age", age);
			student.put("name",name);
			student.put("height", "3");
			record.add(student);

			i++;
			
			//I T E R A T I N G  M A P  E N T R I E S  O F   L I S T
			
			
			for (Map<String, String> entryset : record) {
				
				for(Map.Entry<String, String> entry : entryset.entrySet()) {
				
					System.out.println(entry.getValue());
				}
			}
		}
//		=========================================================================================
		
//		I T E R A T I N G   L I S T   U S I N G   I T E R A T O R 
		
//		=========================================================================================
		scan.close();
	}
}
