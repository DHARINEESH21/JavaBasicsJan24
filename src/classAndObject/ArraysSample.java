package classAndObject;

public class ArraysSample {
	
	public static void main(String[] args) {
		String strNames[] = {"Pinky","Wicky","John"};
		int[] age = {12,3,4,5,6};
		
		System.out.println("Accessing elements of an arrat:");
		System.out.println("First element: " + age[0]);
		System.out.println("Second element: " + age[1]);
		System.out.println("Third element: " + age[2]);
		System.out.println("Fourth element: " + age[3]);
		System.out.println("Fifth element: " + age[4]);
		
		
		//loop through the array
		//using the loop
		
		System.out.println("Using the loop");
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		//accessing all elements using for each loop
		System.out.println("Using for- each loop:");
		for(int a: age)
		{
			System.out.println(a);
		}
		
		
		int[] numbers = {2,3,4,4,5,-9,23,4,11,12};
		int sum = 0;
		Double average;
		
		
		for(int number:numbers) {
			sum+=number;
		}
		
		int arrayLength = numbers.length;
		
		average = ((double)sum/(double)arrayLength);
		
		System.out.println("Sum =" +sum);
		System.out.println("Average"+ average);
		
		
		//create 2d array
		
		int[][] a = {
				{1, 2, 3},
				{1, 4, 5, 6},
				{7},
		};
		
		
		//calculate the length of each row
		System.out.println("Length of row 1: " +a[0].length);
		System.out.println("Length of row 2: " +a[1].length);
		System.out.println("Length of row 3: " +a[2].length);
	}

}
