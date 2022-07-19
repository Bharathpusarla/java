package assistedprojects;

public class paraconstructor {
	int id;
	String name;
	paraconstructor(int i, String n){
		id=i;
		name =n;
		
	}
	void display() {
		System.out.println(id +" " +name);
		
	}
	
		public static void main(String args[]) {
			paraconstructor k =new paraconstructor(565,"bharath");
			paraconstructor s = new paraconstructor(654,"suray");
			k.display();
			s.display();
		}
}


