package jan23Assignment;
import java.util.Scanner;
public class MinToYearDays {
	 public static void main(String[] args) {

	        double minutesInYear = 60 * 24 * 365;

	        Scanner input = new Scanner(System.in);

	        System.out.print("Number of minutes: ");

	        int min = input.nextInt();

	        long years = (long) (min / minutesInYear);
	        int days = (int) (min / 60 / 24) % 365;

	        System.out.println( min + " minutes is " + years + " years and " + days + " days");
	    }
	}


