package jan26Assignments;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class MonthLeftInYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     LocalDate todayDate = LocalDate.now(); 
		     LocalDate lastDayOfYear = todayDate.with(TemporalAdjusters.lastDayOfYear());
		     Period period = todayDate.until(lastDayOfYear);
		     System.out.println();
		     System.out.println("Months remaining in the year: "+period.getMonths());	
		     System.out.println();
		   }
		}


	