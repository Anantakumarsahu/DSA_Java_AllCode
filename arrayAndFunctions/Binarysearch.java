package arrayAndFunctions;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i;
		System.out.println("Enter the elements in the array");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int key = sc.nextInt();
		System.out.println(binarySearch(arr,key));

	}
	
	public static String binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (high+low)/2;
			if(arr[mid]==key) {
				return ("Element Found at " + mid + " position");
			}
			else if(arr[mid]<key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return "Element Not Found";
	}

}
