package Staticbinding;

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		obj.add(2,4);
		obj.add(2.5f,4.5f);
		obj.add(2,5,4);
		
	}
	void add(int a, int b) {
		int result = a+b;
		System.out.println("Result=" + result);
		
	}
	void add(float a,float b) {
		float result = a+b;
		System.out.println("Result=" + result);
		
	}
	void add(int a,int b,int c) {
		int result = a=b=c;
		System.out.println("Result=" + result);
	}
	
	

}
