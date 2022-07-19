
public class innerclass {
 private String msg="This is bharath"; 
	 
	 class Inner{  
	  void hello()
	  {
		  System.out.println(msg+", I am learning java");
		  }  
	 }  

	 public static void main(String[] args) {
		 innerclass obj=new innerclass();
			innerclass.Inner in=obj.new Inner();  
			in.hello();  
		}

}
