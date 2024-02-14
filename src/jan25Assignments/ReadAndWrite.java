package jan25Assignments;
import java.io.File;
public class ReadAndWrite {

	public static void main(String[] args) {
	
		   
		        // Create a File object
		        File file = new File("input.txt");
		         if (file.canWrite()) 
		           {
		            System.out.println(file.getAbsolutePath() + " can write.\n");
		           } 
		         else
		          {
		            System.out.println(file.getAbsolutePath() + " cannot write.\n");
		          }
		         if (file.canRead()) 
		           {
		            System.out.println(file.getAbsolutePath() + " can read.\n");
		           } 
		         else
		          {
		            System.out.println(file.getAbsolutePath() + " cannot read.\n");
		          }  
		      }
}
		  

	
