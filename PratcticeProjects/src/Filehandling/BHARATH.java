package Filehandling;
import java.io.*;
import java.util.Scanner;


public class BHARATH {
	public static void main(String args[]) {
		try {
			File obj = new File("C:\\javaprojects\\bharath.txt");
			if(obj.createNewFile()) {
				System.out.println("FileCreated " +obj.getName());
			}else {
				System.out.println("Already file exits");
			}
		}
			catch (Exception e) {
				System.out.println("error occured");
				e.printStackTrace();
			}
		try {
			FileWriter writer = new FileWriter("C:\\javaprojects\\bharath.txt");
			writer.write("I have writing something to File using FileWriter pacakage");
			writer.close();
			System.out.println("Sucessfully written into file");
			}catch(Exception e) {
				System.out.println("Exception occured");
				e.printStackTrace();
				}
		
		try {
			File obj = new File("c:\\javaprojects\\bharath.txt");
			Scanner myReader = new Scanner(obj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("Reading from File: ");
				System.out.println(data);
			}
			myReader.close();
		}
		catch(Exception u) {
			System.out.println("Exception occured");
			u.printStackTrace();	
		}
			
				
	}
	

}
