package arrayAndFunctions;

import java.util.Scanner;

public class CeilAndFloorOfNumberInArray {

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
		int ceil = ceilFinder(arr,search);
		int floor = floorFinder(arr,search);
		
		System.out.println("The ceil of " + search + " number is " + ceil);
		System.out.println("The floor of " + search + " number is " + floor);

	}
	
	//To Find the ceil of the element.................
	public static int ceilFinder(int[] arr, int search) {
		int result=0;
		int high = arr.length-1;
		int low = 0;
		while(low<=high) {
			int mid = (high+low)/2;
			if(arr[mid]==search)
				return arr[mid];
			else if(arr[mid]<search) 
				low = mid+1;
			else {
				result = arr[mid];
				high=mid-1;
			}
		}
		return result;
		
	}
	
	//To Find the Floor of the element.................
	public static int floorFinder(int[] arr, int search) {
		int result=0;
		int high = arr.length-1;
		int low = 0;
		while(low<=high) {
			int mid = (high+low)/2;
			if(arr[mid]==search)
				return arr[mid];
			else if(arr[mid]<search) {
				result = arr[mid];				
				low = mid+1;
			}
			else
				high=mid-1;
		}
		return result;
		
	}

}
