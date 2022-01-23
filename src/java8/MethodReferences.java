package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//not required for now
abstract interface MethodReferences {

	abstract void methodName();
	default void methodList() {
		System.out.println("This is method list");
	}
}
class Main{
	public static void main(String args[]) {
		//creating list
		List<String> listOfStr = new ArrayList<String>();
		//inserting items into list
		listOfStr.addAll(Arrays.asList("this","is","string","list"));
		//defining abstract method into anonymous class
		Consumer<String> obj = System.out::println;
		//using method definition
		listOfStr.forEach(obj);
	}
}