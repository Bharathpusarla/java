package Readerwriter;
import java.io.*;
import java.util.StringTokenizer;

public class BufferClass {
	public static void main(String args[]) throws IOException{
		
		FileReader Fr = new FileReader("C:\\javaprojects\\bharath.txt");
		BufferedReader br = new BufferedReader(Fr);
		String line;int count =0;
		while((line = br.readLine())!= null) {
			StringTokenizer st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				count++;
				st.nextToken();
			}
		}
		br.close();
		Fr.close();
		System.out.println("count in file: " + count);
	}

}
