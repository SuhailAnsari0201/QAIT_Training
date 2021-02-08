package Selflearning.Demo1;

import java.io.*;
public class FileInputStreamExample1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("myFirstFile.txt");
		int i=0;
		while(i!=-1){
			i=fis.read();
			System.out.print((char)i);
		}
		fis.close();
	}

}
