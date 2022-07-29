package Longestsubsequece;

import java.util.Arrays;
import java.util.Scanner;

public class Lis {
	   public int lengthofLis(int[] nums) {
		   if(nums.length<=1) 
			   return nums.length;
		   int[] ind = new int[nums.length];
		   int max =1;
		   Arrays.fill(ind,1);
		   for (int i=0;i<nums.length;i++) {
			   for(int j=0;j<i;j++) {
				   if(nums[j]<nums[i]) {
					   ind[i] = Math.max(ind[i], ind[j]+1);
					   
				   }
		   }
		   max = Math.max(max, ind[i]);
	   }
	   return max;
	   }
	   public static void main(String args[]) {
		   Scanner scan = new Scanner(System.in);
		   System.out.println("enter size of an array : ");
		   int size = scan.nextInt();
		   int [] num= new int[size];
		   System.out.println("enter the elements into  an array : ");
		   for (int i=0;i<size;i++) {
			   num[i]= scan.nextInt();
			   
		   }
		   Lis x = new Lis();
		   x.lengthofLis(num);
		  System.out.println("length of longestsubsequence of array is: "+ x.lengthofLis(num));
		
	}
}
   

