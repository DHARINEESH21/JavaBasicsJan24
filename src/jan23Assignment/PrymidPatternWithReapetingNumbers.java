package jan23Assignment;
import java.util.Scanner;
public class PrymidPatternWithReapetingNumbers {
	
	  public static void main(String[] args)
	{
	   System.out.print (" Rows: ");
	   Scanner input = new Scanner(System.in);

			    int Row=input.nextInt();

			    for (int m=1;m<=Row;m++) {
                     for(int n=1;n<=Row-m;n++) {
                          System.out.print(" ");
                          }

			          for (int k=1;k<=m;k++) {

			               System.out.print(m + " ");

			               }

			    System.out.println();

			    }



			    }



			    }
	



