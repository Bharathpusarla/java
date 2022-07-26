package Fis;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FisDemo {
	public static void main(String args[]) {
		
		File NewFile  = new File("C:\\javaprojects\\bharath.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(NewFile);
			System.out.println("File successfully opened");
			int i;
			while ( (i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File closed");
		}
		
		
	}
	

	}
	


