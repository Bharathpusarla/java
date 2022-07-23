package dynamicbinding;

public class MacBookPro extends MacBook {
	void start() {
		System.out.println("Inside MacbookPro start()");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacbookPro shutdown()");
	}

}
