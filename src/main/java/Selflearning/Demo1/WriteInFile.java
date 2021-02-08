package Selflearning.Demo1;

import java.io.*;
public class WriteInFile {

	public static void main(String[] args) throws IOException {
		
		// Create a new file and write in file.
		
		FileWriter writer = new FileWriter("myFirstFile.txt");
		
		//Write some string in file
		//if here file not exist with same name. its create first then write
		//if here file exist with same name the write only
		//if here file have data then replace all old data with new data
		writer.write("Hello World My name is Suhail and im writing some strings in again file again.\nSecond line");
		
		//close the writer
		writer.close();
		
		System.out.println("Successfully wrote to the file.");
	}
	

}
