package jan25Assignments;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class ReadContentLineByLine {

	public static void main(String[] args) {

		    try {

		
		      FileInputStream file = new FileInputStream("input.txt");
		      BufferedInputStream input = new BufferedInputStream(file);
		      int readthewords = input.read();

		      while (readthewords != -1) {
		        System.out.print((char) readthewords);
		        readthewords = input.read();
		      }
		      input.close();
		    }

		    catch (Exception e) {
		      e.getStackTrace();
		    }
		  }
		}


