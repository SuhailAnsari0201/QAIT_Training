package Selflearning.Demo1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class IO_Stream {

	public static void main(String[] args) throws Exception
	{
	
		PrintWriter out = new PrintWriter("myFirstFile.txt");
		System.out.println("Enter how many recored you enter.");
		Scanner in = new Scanner(System.in);
		int rec = in.nextInt();
		for(int i=0;i<rec;i++)
		{
			System.out.println("Record "+(i+1));
			System.out.println("Enter id");
			int id=in.nextInt();
			System.out.println("enter name");
			String str=in.next();
			System.out.println("enter salary.");
			double sal=in.nextDouble();
			out.println(id+" "+str+" "+sal);	
		}
		out.close();
		FileReader br = new FileReader("myFirstFile.txt");
		BufferedReader bfr = new BufferedReader(br);
		
//		FileInputStream fis = new FileInputStream("myFirstFile.txt");
		
//		int i=0;
//		while(i!=-1){
//			i=fis.read();
//			System.out.print((char)i);
//		}
//		fis.close();
		
		while(bfr.ready())
		{
			String s=bfr.readLine();
			System.out.println(s);
		}
		
		bfr.close();
		br.close();
		
		
	}

}
