package dynamicbinding;

public class MacBookAir extends MacBook {
	void start() {
		System.out.println("Inside MacBookAir start()");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacBookAir shutdown()");
	}
	

}
