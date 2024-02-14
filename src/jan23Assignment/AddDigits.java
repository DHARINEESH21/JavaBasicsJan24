package jan23Assignment;
import java.util.Scanner;  
public class AddDigits {
	public static void main(String args[])  
	{  
	int number, digit, sum = 0;  
	Scanner input = new Scanner(System.in);  
	System.out.print("Number is: ");  
    number = input.nextInt();  
    if(number <=0 || number>1000 )
    {
    	System.out.println("enter the number within the range limit");
    }
    
    else {
    	while((number!=0)  ){
    		{  
    		  digit = number % 10;  
    		  sum = sum + digit;  
    		  number = number / 10;  
    		}  
    	
    }
    	

	System.out.println("Result "+sum);  
    	}
	}  
	}  
