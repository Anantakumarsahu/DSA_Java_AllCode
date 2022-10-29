package arrayAndFunctions;

import java.util.Scanner;

public class CeilAndFloorOptimized {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of elements in the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i;
		System.out.println("Enter the elements in the array");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a element to find its ceil and floor");
		int search = sc.nextInt();
		int ceil = 0;
		int floor = 0;
		int high = arr.length-1;
		int low = 0;
		while(low<=high) {
			int mid = (high+low)/2;
			if(arr[mid]<search) {
				low = mid+1;
				floor = arr[mid];
			}
			else if(arr[mid]>search){				
				high = mid-1;
				ceil = arr[mid];
			}
			else {
				ceil = arr[mid];
				floor = arr[mid];
			}
		}
		
		System.out.println("The ceil of " + search + " number is " + ceil);
		System.out.println("The floor of " + search + " number is " + floor);

	}
}
