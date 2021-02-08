package Selflearning.Demo1;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	File myObj = new File("myFirstFile.txt");
    	 try {
			if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			        System.out.println( "New File name is = "+myObj.getName() );
			        System.out.println( "File is readable/writable = "+myObj.canRead()+"/"+myObj.canWrite() );
			      } else {
			        System.out.println("File already exists.");
			        System.out.println( "File is readable/writable = "+myObj.canRead()+"/"+myObj.canWrite() );
			      }
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
       
        }
}
