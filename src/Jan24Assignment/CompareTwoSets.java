package Jan24Assignment;
import java.util.*;

public class CompareTwoSets {

	public static void main(String[] args) {

		        HashSet<String> set1 = new HashSet<String>();
		   
		          set1.add("Red");
		          set1.add("Blue");
		          set1.add("Black");
		          set1.add("White");
	
		          HashSet<String> set2 = new HashSet<String>();
		          set2.add("Red");
		          set2.add("Pink");
		          set2.add("Black");
		          set2.add("Orange");
		  
		          set1.retainAll(set2);
		          System.out.println("HashSet content:");
		          System.out.println(set1);
		     }
	
	}


