package jan23Assignment;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);
	        double fahrenheit = input.nextDouble();
	        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
	        System.out.println(fahrenheit + " = " + celsius + " in Celsius");
	    }
	}



