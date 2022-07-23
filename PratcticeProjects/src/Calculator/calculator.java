package Calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("choose option \n1-addition\n2-subratction\n3-multiplucation\n4-divison");
		System.out.println("enter:");
		int opt = x.nextInt();
		System.out.println("enter fisrt value");
		int a= x.nextInt();
		System.out.println("enter second value");
		int b= x.nextInt();
		if(opt ==1) {
			System.out.println("additin is " + (a+b));
		}
		else if(opt == 2) {
			System.out.println("subtraction is "+ (a-b));
		}
		else if(opt == 3) {
			System.out.println("multilpcation is  "+(a*b));
		}
		else if(opt == 4){
			try {
			System.out.println("division is " + (double)(a/b));
		} catch(Exception ex)
			{
			System.out.println("enter correct second value");
		}
			}
		else {
			System.out.println("choose correct option");
		}
		
	}

}


