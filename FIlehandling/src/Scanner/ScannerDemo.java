package Scanner;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String rags[]) {
		int sum =0;
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			int n=s.nextInt();
			sum = sum+n;
			
		}
		System.out.println(sum);
	}

}
