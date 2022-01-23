package java8;

import java.io.File;
import java.io.FileFilter;

public class LambdaExp {
	
	public static void main(String args[]) {
		
		//CREATING LAMBDA EXPRESSION FOR FILE FILTER INTERFACE
		FileFilter filter = (File pathname)->{
			return pathname.getName().endsWith(".java");
		};
		
		File dir = new File("C:\\Users\\mahbisht\\Documents\\WORK_SPACES_STS\\CORE_JAVA_PRACTICE\\generated_files");
		File[] files = dir.listFiles(filter);
		
		for (File f:files) {
			System.out.println(f);
		}
	}
}
