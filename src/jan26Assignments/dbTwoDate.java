package jan26Assignments;
import java.time.*;
import java.util.*;
public class dbTwoDate {

	public static void main(String[] args) {

	
		        LocalDate presentdate = LocalDate.of(2024, 01, 26);
		        LocalDate currentdate = LocalDate.now();
		 
		        Period diff = Period.between(presentdate, currentdate);
		 
		     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
		                    diff.getYears(), diff.getMonths(), diff.getDays());
		  }
		}


	
