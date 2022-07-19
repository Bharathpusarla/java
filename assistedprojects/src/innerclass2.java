
public class innerclass2 {
	private String A= "why are u here? ";
	 
	class inner{
		void hello()
		{
			System.out.println(A+"for learing");
		}
	}
 public static void main(String args[]) {
	 innerclass2 B= new innerclass2();
	 innerclass2.inner x = B.new inner();
	 x.hello();
 }
}
