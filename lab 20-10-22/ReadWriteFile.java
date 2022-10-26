package lab.oct;
/*
 * @pritam khan
 */

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {

	public static void main(String[] args) {
		
		String name = "My name is Khan";
		
		//try-catch block for exception handeling
		try {
			
			//to write the file
			FileWriter obj=new FileWriter("E:\\rwf.txt");
			obj.write(name);
			
			//to read the file
			FileReader obj1=new FileReader("E:\\rwf.txt");
			int i=0;
			while((i=obj1.read())!=-1) {
				System.out.println((char)i);
			}
			//closing the reading and writing file
			obj.close();
			obj1.close();
			//if successfull then print the message
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
