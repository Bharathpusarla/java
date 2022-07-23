package JoinDemo;

import java.util.Scanner;

public class JoinDemo extends Thread{
	private static int n,sum;
	public static void main(String args[]) {
		System.out.println("Sum of first Nnumbers");
		System.out.println("Enter avaluve :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Sum of first"+ JoinDemo.n+ "numbers: " + JoinDemo.sum);
	}public void run() {
		for (int i=1; i<JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
		
		
	}

}
