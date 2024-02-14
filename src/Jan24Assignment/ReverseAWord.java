package Jan24Assignment;
import java.util.*;
public class ReverseAWord {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = input.nextLine();
	        String[] getword = inputString.split(" ");
	        String reverseAString = reverseWords(getword);
	        System.out.println("Original String: " + inputString);
	        System.out.println("Reversed String: " + reverseAString);

	    }

	    private static String reverseWords(String[] words) {
	        for (int i = 0; i < words.length; i++) 
	        {
	            words[i] = new StringBuilder(words[i]).reverse().toString();

	        }        
	        return String.join(" ", words);
	    }

	}


	

