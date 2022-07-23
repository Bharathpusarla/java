import java.util.Scanner;

public class dividebyzero {
	public static void main(String args[]) {
		int a,b,c,d;
		System.out.println("enter two integers: ");
		try {
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		d=a%b;
		System.out.println(c+" "+d);
		} catch(Exception e){
			System.out.println("its exception dude: ");
		}
	
				System.out.println("its ok");
			
		
	}

}
