package Filehandling;
import java.io.*;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String args[]) {
		try {
			File obj = new File("c:\\javaprojects\\File2.txt");
			Scanner myReader = new Scanner(obj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();	
			
		}
		
	}

}
