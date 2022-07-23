package Filehandling;
import java.io.*;


public class CreateNewfile{
	public static void main(String[] args) {
		try {
			File obj = new File("C:\\javaprojects\\File2.txt");
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
		}
	}

				
		
	
	


