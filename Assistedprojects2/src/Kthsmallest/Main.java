package Kthsmallest;

public class Main {
	public static void main(String[] args) {
		KthSmallest ob = new KthSmallest(); 
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int n = arr.length,k = 3; 
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }


}
