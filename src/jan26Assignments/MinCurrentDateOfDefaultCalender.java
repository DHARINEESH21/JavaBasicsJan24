package jan26Assignments;
import java.util.*;
public class MinCurrentDateOfDefaultCalender {
		public static void main(String[] args)
		    {
		     // Create a default calendar
		        Calendar cal = Calendar.getInstance();
				System.out.println();
				System.out.println("\nCurrent Date and Time:" + cal.getTime());		
				int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
				System.out.println("Actual Maximum Year: "+actualMaxYear);
				int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
				System.out.println("Actual Maximum Month: "+actualMaxMonth);
				int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
				System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
				int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
				System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
		
				
			  }
		}


	
