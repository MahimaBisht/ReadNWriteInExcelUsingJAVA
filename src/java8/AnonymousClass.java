package java8;

import java.io.File;
import java.io.FileFilter;

public class AnonymousClass {

	public static void main(String args[]) {
		
		// DEFINING ANONYMOUS CLASS FOR FILE FILTER INTERFACE
		FileFilter obj = new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};
		
		// CREATING FILE OBJECT
		File dir = new File("C:\\Users\\mahbisht\\Documents\\WORK_SPACES_STS\\CORE_JAVA_PRACTICE\\generated_files");

		// GETTING ARRAY OF FILES ENDS WITH .JAVA
		File[] files = dir.listFiles(obj);
		
		// ITERATING ARRAY
		for (File file: files) {
			System.out.println(file);
		}
	}
}
