package Jan24Assignment;
import java.util.*;

import oopsSamples.Student;
public class ReverseElement {
	

	  public static void main(String[] args) {
	 
	  List<String> list = new ArrayList<String>();
	  
//	  Scanner sc=new Scanner(System.in);  
//	  int a= sc.nextInt();
//	
//	  int arr[] = new int[a];
//	  
//	  for(int i=0; i<a;i++)
//	  {
//		  arr[i] = sc.nextInt();
//	  }
	  list.add("car");
	  list.add("bike");
	  list.add("truck");

	  System.out.println("before reversing :\n" + list);  
	  Collections.reverse(list);
	  System.out.println("after reversing :\n" + list); 
	 }
	}


