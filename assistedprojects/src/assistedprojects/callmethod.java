package assistedprojects;

public class callmethod {
	int val=150;
	int operation (int val) {
		val= val*10/100;
		return val;
	
	}
	public static void main(String[] args) {
		callmethod n= new callmethod();
		System.out.println(n.val);
		n.operation(100);
	System.out.println(n.val);
	System.out.println(n.operation(150));
	}

}
