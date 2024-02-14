package jan25Assignments;
import java.io.File;
import java.util.Date;
public class LastModifiedDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       File file = new File("input.txt");
		       Date date=new Date(file.lastModified());
			   System.out.println("\nlast modified date is: "+date);	   
		     }
		


	}

