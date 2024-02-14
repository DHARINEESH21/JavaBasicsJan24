package ioSamples;

import java.io.FileWriter;

public class FileWriterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date = "Wtrite a value in the output file";
		
		try {
			//create a file writer
			FileWriter output = new FileWriter("output.txt"); // true = to append the date in the text file
			
			//Write the string to the file
			output.write(date);
			output.flush();
			
			// close the writer
			output.close();
		}
		
		catch (Exception e ) {
			e.getStackTrace();
		}

	}

}
