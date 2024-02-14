package jan23Assignment;
import java.util.Scanner;
public class InchesToMeters {

	    public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("inch: ");
	        double inch = input.nextDouble();
	        double meters = inch * 0.0254;
	        System.out.println(inch + " = " + meters + "m");

	    }
	}


