package Buoi1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {
	public static void main (String[] arg) {
		String from = "testdata.txt";
		String to="testcopied.txt";
		try {
			fileCopyUsingFileStreams(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		readAFileThenPrintToConsole(to);
	}
	
	private static void fileCopyUsingFileStreams(String from, String to) throws IOException
	{
	    File fileToCopy = new File(from);
	    FileInputStream input = new FileInputStream(fileToCopy);
	 
	    File newFile = new File(to);
	    FileOutputStream output = new FileOutputStream(newFile);
	     
	    byte[] buf = new byte[1024];
	    int bytesRead;
	     
	    while ((bytesRead = input.read(buf)) > 0)
	    {
	        output.write(buf, 0, bytesRead);
	    }
	     
	    input.close();
	    output.close();
	}
	
	private static void readAFileThenPrintToConsole (String path) {
		File file = new File(path); 
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		String st; 
		try {
			while ((st = br.readLine()) != null) {
				System.out.println(st); 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
