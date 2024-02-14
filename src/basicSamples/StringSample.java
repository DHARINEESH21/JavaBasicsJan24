package basicSamples;

public class StringSample {
	
	public static void main(String[] args) {
		
		String type = "Java Programming";
		
		String first = "Java is a Object Oriented Programming";
		String second = "Python";
		String third = "Language";
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		System.out.println("Length of the string..." + first.length());
		
		String substr = first.substring(10,16);
		System.out.println(substr);
		
		String joinedString = first.concat(third);
		System.out.println("Joined String is.."+joinedString);
		
		
		first = "java programming";
		second = "Java programming";
		third = "python programming";
		
		System.out.println("char at 2 is  "+first.charAt(2));
		
		first.charAt(2);
		String[] words = first.split(" ");
		System.out.println("each word..");
		for(int i=0; i<words.length;i++) {
			System.out.println(words[i]);
			
		}
		//boolean result1 = first.equals(second);
		
		boolean result1 = first.equalsIgnoreCase(second);
		System.out.println("String first and second are equal"+result1);
		
		if(first == second) {
			System.out.println("both strings are equal..");
		}
		
		boolean result2 = first.equals(third);
		System.out.println("string first and third are equal: "+result2);
		
		String example ="Hello";
		example = example.concat("welcome");
		
		String newString = new String("Java Program");
		String newStringOne = new String ("Java Program");
		if(newString == newStringOne) {
			// if(newString.equals(newStringOne){
			System.out.println("both are equal..");
		}
		
		System.out.println("Compare newstring and newStringOne : " + newString.equals(newStringOne));
		System.out.println("Value of newString"+ "newString.toUppeCase");
		
	}

}
