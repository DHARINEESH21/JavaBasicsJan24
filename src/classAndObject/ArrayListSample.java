package classAndObject;
import java.util.ArrayList;

public class ArrayListSample {
	public static void main(String[] args) {
		
		//create ArrayList
		
		ArrayList<String> languages = new ArrayList<>();
		System.out.println("Size.."+languages.size());
		
		//Add elements to ArrayList
		languages.add("java");
		languages.add("python");
		languages.add("Swift");
		languages.add("Typescript");
		System.out.println("ArrayList: "+languages);
		System.out.println("Size:"+ languages.size());
		
		//to read element
		System.out.println("Get Element"+languages.get(1));
		
		//toUpdate Element
		languages.set(2,  "javascript");
		
		//to remove element
		languages.remove(3);
		System.out.println("After update ArrayList: " + languages);
	}

}
