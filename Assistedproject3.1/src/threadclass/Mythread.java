package threadclass;
public class Mythread extends Thread {
	public void run() {
		System.out.println("Thread is running");
		
	}
	public static void main(String args[]) {
		Mythread x =new Mythread();
		x.start();
		
		
	}
	
	

}
