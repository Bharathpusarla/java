package Suminrange;

public class rangequery {
	 static void rangequery(int l ,int r,int [] a) {
		int n= a.length;
		int sum = 0;
		for (int i=0;i<n;i++) {
			if(i>=l && i <= r) {
				sum = sum +a[i];
			}
		}
		System.out.println("Sum in the range of query is:" + sum);
		
	}
	
	public static void main(String[] args) {
		int[] a = { 3, 7, 2, 5, 8, 9};
		rangequery(0,5,a);
		rangequery(3,5,a);
		rangequery(2,4,a);
		
	}

}
