package assistedprojects;
class privateaccessspecifier {
	private void display() {
	System.out.println("private class" );
	}


	public static void main(String args[]) {
		System.out.println("private access");
		privateaccessspecifier b = new privateaccessspecifier();
		b.display();
	}
}