package praticeprojects;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Emailvalidation {
	public static void main(String[] args) {

	String[] a= {"pusarlabharath@gmail.com","bharathpusarla5@gmail.com","bharathpusarla4@gmail.com","bharathpusarla3@gmail.com","bharathpusarla2@gmail.com","bharathpusarla1@gmail.com"};
	 String k;
	 Scanner email =new Scanner(System.in);
	 System.out.println("Please enter email:");
	 k=email.nextLine();
	 List<String> w =Arrays.asList(a);
	 boolean result = w.contains(k);
	 if(result)
		 System.out.println("email is validated");
	 else
		 System.out.println("please enter corect email");
	  
	}
}
	 
