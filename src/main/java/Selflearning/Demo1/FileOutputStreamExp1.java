package Selflearning.Demo1;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExp1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("myFirstFile.txt");
		String s="\nFileOutputStream Example1";
		byte arr[] = s.getBytes();
			fos.write(arr);
		fos.close();
	}
}
