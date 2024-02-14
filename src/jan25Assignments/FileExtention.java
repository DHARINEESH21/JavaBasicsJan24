package jan25Assignments;

import java.io.File;
import java.util.Scanner;

public class FileExtention {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        String folderPath = scanner.nextLine();
        String fileExtension = scanner.nextLine();
        scanner.close();
        
        File folder = new File(fileExtension);
        if (folder.exists() && folder.isDirectory()) {
		String filename = folder.toString() ;
		  int index = filename.lastIndexOf('.');
		  System.out.println(index);
		    if(index > 0) {
		      String extension = filename.substring(index + 1);
		      System.out.println("File extension is " + extension);
		    }
		  }
        else {
        	System.out.println("Fileextension doesnot present");
        }
		

	
	}
}



