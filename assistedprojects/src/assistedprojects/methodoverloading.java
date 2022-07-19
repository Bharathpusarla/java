package assistedprojects;

public class methodoverloading {
	double pi =3.14159;
	public void area(int l,int b){
		System.out.println("area of rectange: "+ (l*b));
		
		  }
	public void area(int r) {
		System.out.println("area of circle: " +(pi*(r*r)));
	}
	public static void main(String[]args) {
		methodoverloading n = new methodoverloading();
		n.area(4);
		n.area(6,9);
	}

}
