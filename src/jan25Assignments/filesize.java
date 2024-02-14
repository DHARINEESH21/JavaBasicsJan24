package jan25Assignments;
import java.io.File;
public class filesize {

	public static void main(String[] args) {
		 
				File file = new File("D:\\3 task 19Jan Dharineesh S"); 
				if (file.exists()) { 
					double bytes = file.length(); 
					System.out.println("bytes : " + bytes);
					double kilobytes = (bytes / 1024);
					System.out.println("kilobytes : " + kilobytes); 
					double megabytes = (kilobytes / 1024); 
					System.out.println("megabytes : " + megabytes); 


				} 
				else { 
					System.out.println("File does not exists!"); 
				} 
			} 
		}



