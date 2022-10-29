package arrayAndFunctions;

import java.util.Scanner;

public class AllSubarraysOfAnArray {
	
	public static void display(int[] a, int start, int end){
		System.out.print("[ ");
	    for(int i=start; i<=end; i++) {
	    	System.out.print(a[i] + " ");
	    }
	    System.out.print("]");
	    System.out.println();
	  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i;
		System.out.println("Enter the elements in the array");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		printSubArrays(arr);


	}
	
	public static void printSubArrays(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i; k<=j; k++) {
			    	System.out.print(arr[k] + " ");
			    }
				System.out.println();
				//display(arr, i, j);
			}
		}
	}

}
