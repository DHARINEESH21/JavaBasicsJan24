package jan26Assignments;
import java.util.*;
public class DataObjectCalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    {
		     int year = 2023;
		     int month = 8; 
		     int date = 1;
		     Calendar cal = Calendar.getInstance();
		     cal.clear();
		     cal.set(Calendar.YEAR, year);
		     cal.set(Calendar.MONTH, month);
		     cal.set(Calendar.DATE, date);
		     System.out.println(cal.getTime());
		     System.out.println();
			 }
		}


	}


