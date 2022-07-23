package threadclass;
public class MythreadRunnable  implements Runnable{
	public static int mycount=0;
	public MythreadRunnable() {
		}

	@Override
	public void run() {
		while(MythreadRunnable.mycount<=10) {
			try {
				System.out.println("Expl thread: "+(++MythreadRunnable.mycount));
				Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println("Exception in thread: "+e.getMessage());
				}
		
	
	}
	
	}

    public static void main(String args[]) {
    	System.out.println("Strating main Thread..");
    	MythreadRunnable n = new MythreadRunnable();
    	Thread t =new Thread(n);
    	t.start();
    	while(MythreadRunnable.mycount<=10) {
    		try {
    		System.out.println("main thread: "+(++MythreadRunnable.mycount));
    		Thread.sleep(1000);
    		}catch(Exception u) {
    			System.out.println("Exception in mainthread: "+u.getMessage());
    			
    		}
    		System.out.println("End of main thread..");
    	}
    }
    	
   }
	
