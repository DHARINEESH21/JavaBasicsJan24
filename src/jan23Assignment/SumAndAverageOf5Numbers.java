package jan23Assignment;
import java.util.Scanner;
public class SumAndAverageOf5Numbers {
	  public static void main(String[] args)

	{       
	    int i,num=0,sum=0;
		
			for (i=0;i<5;i++)
			{
			    Scanner in = new Scanner(System.in);
			    num = in.nextInt();
			    
	  		sum +=num;
		}
		double average=sum/5;
		System.out.println(" sum: " +sum+"\n Average is : " +average);
	 
	}
	}


