package Readerwriter;
import java.io.*;
public class FileReaderWriterDemo {
	public static void main (String args[])  throws IOException {
		FileReader fr = new FileReader("C:\\javaprojects\\File.txt");
		FileWriter fw = new FileWriter("C:\\javaprojects\\File2.txt");
		
		int ch;
		while ( (ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}


	}


