package Selflearning.Demo1;

import java.io.*;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		
		File myObj = new File("myFirstFile.txt");
		
		Scanner reader = new Scanner(myObj);
		
		//read 1 complete line at a time
		 while (reader.hasNextLine()) {
		        String str = reader.nextLine();
		        System.out.println(str);
		      }
		
		 if (myObj.exists()) {
		      System.out.println("File name: " + myObj.getName());
		      System.out.println("Absolute path: " + myObj.getAbsolutePath());
		      System.out.println("Writeable: " + myObj.canWrite());
		      System.out.println("Readable " + myObj.canRead());
		      System.out.println("File size in bytes " + myObj.length());
		 }
		 
		 //for deleting the file.
		 
//		 if (myObj.delete()) { 
//		      System.out.println("Deleted the file: " + myObj.getName());
//		    } else {
//		      System.out.println("Failed to delete the file.");
//		    } 
		 
		 
		 
		 reader.close();
	}
}
