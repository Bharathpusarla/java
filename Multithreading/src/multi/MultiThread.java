package multi;

	public class MultiThread extends Thread {
		
		public static void main(String[] args) throws InterruptedException {
			MultiThread mt = new MultiThread();
			mt.start();
			MultiThread n = new MultiThread();
			n.su();
			for (int j=1; j<=50; j++) {
				System.out.println("j: " + j + "\t");
				Thread.sleep(1000);
			}
		}

		@Override
		public void run() {
			for (int i=1; i<=50; i++) {
				System.out.print("i: " + i + "\t");
			}
		}void su(){
			for( int k= 0;k<=50;k++) {
				System.out.print("k: " + k);
			}
		}
		
	}

