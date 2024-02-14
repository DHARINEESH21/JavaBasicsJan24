package ioSamples;

import java.io.File;
import java.io.IOException;

public class FilesCreateSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a file object for the current location
		File dir = new File ("D:\\SDET technical training");
		File files[] = dir.listFiles();
		for(int i=0; i< files.length; i++) {
			System.out.println(files[i].getName());
			
		}
		
		boolean value = false;
		
		
		// trying to create a file based on the object
		boolean isDir = dir.isDirectory();
		dir.getAbsolutePath();
		dir.exists();
		
		if(isDir) {
			File file = new File("newFile1");
			try {
				value = dir.createNewFile()
;
				File.createTempFile("mytext","txt", dir);
				}catch (IOException e) {
					e.printStackTrace();
				}
		}
		

		if(value) {
			System.out.println("The new file is created");
		}
		else {
			System.out.println("the file already exisits");
		}
	}

}
