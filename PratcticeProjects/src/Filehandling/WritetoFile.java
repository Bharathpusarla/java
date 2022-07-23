package Filehandling;
import java.io.*;

public class WritetoFile {
	public static void main(String args[]) {
		try {
		FileWriter writer = new FileWriter("C:\\javaprojects\\File2.txt");
		writer.write("I have writing something to File using FileWriter pacakage");
		writer.close();
		System.out.println("Sucessfully written into file");
		}catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
			}
		
		
	}

}
