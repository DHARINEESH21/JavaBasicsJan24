package jan26Assignments;
import java.util.*;

public class CurrentDateOfDefaultCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    {
		    
		        Calendar cal = Calendar.getInstance();
				System.out.println();
				System.out.println("\nCurrent Date and Time:" + cal.getTime());		
				int actualMaxYear = cal.getActualMinimum(Calendar.YEAR);
				System.out.println("Actual Minimum Year: "+actualMaxYear);
				int actualMaxMonth = cal.getActualMinimum(Calendar.MONTH);
				System.out.println("Actual Minimum Month: "+actualMaxMonth);
				int actualMaxWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
				System.out.println("Actual Minimum Week of Year: "+actualMaxWeek);
				int actualMaxDate = cal.getActualMinimum(Calendar.DATE);
				System.out.println("Actual Minimum Date: "+actualMaxDate+"\n");
					
			  }
		}


	}


