package classAndObject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evenNumber = new HashSet<>();
		
		
		// Using add() method
		
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(3);
		evenNumber.add(8);
		
		System.out.println("HashSet: "+evenNumber);
		
		HashSet<Integer> numbers = new HashSet<>();
		
		//Using addAll() method
		
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New Hashset: "+numbers);
		
		//calling iterator() method
		
		Iterator<Integer> iterate = numbers.iterator();
		//accessing element
		
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(" , ");
		}
		
		// using remove() method
		
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 remove?" + value1);
		
		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements remove?" + value2);
		
		//To add string values
		HashSet<String> empList = new HashSet<>();
		empList.add("John");
		empList.add("Peter");
		
		System.out.println("List of employees" + empList);
		empList.add("Rosy");
		System.out.println("List of employess after adding john "+empList);
		
		//TreeSet
		TreeSet<String> empList1 = new TreeSet<>();
		empList.add("John");
		empList.add("Peter");
		empList.add("Andrew");
		
		System.out.println("List of employees" + empList1);
		
		
		
		


		
		
		

	}

}
