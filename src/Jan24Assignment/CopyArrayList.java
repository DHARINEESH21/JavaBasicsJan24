package Jan24Assignment;
import java.util.*;
public class CopyArrayList {
	
	  public static void main(String[] args) {
	  List<String> List1 = new ArrayList<String>();
	  List1.add("hi");
	  List1.add("how");
	  List1.add("r");
	  List1.add("you");
	  System.out.println("List1: " + List1);
	  
	  List<String> List2 = new ArrayList<String>();
	  List2.add("keep");
	  List2.add("Smiling");
	  List2.add("Always");
	  List2.add("Everyone");
	  System.out.println("List2: " + List2);
	
	  Collections.copy(List1, List2);
	  System.out.println("After copy:");
	  System.out.println("List1: " + List1);
	  System.out.println("List2: " + List2);
	 }
	}



