package oops;

public class staticmethod {
	static void method() {
		System.out.println("Inside static method-method()");
		
	}static {
		System.out.println("Inside static block");
		
	}
	public static void main(String args[]) {
		System.out.println("inside main method");
		staticmethod.method();
	}
}
