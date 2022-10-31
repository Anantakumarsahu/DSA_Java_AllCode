package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class FindLastIndexOfAnElement {

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no. of elements in the array: ");
		int n = sc.nextInt();
		System.out.println("Enter all the elements in the array: ");
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element whose last index you want to find");
        int x = sc.nextInt();
        int resultantIndex = 0;
        //resultantIndex = lastIndex(arr, x); //Without Using Recursion part
        resultantIndex = lastIndex(arr, 0, x); //Using Recursion part
        System.out.println(resultantIndex);
    }

    //Without Using Recursion-----------------------
    public static int lastIndex(int[] arr, int x){
    	int count = 0;
    	for(int i=arr.length-1;i>0;i--) {
    		if(arr[i]==x) {
    			return i;
    		}
    	}
        return -1;
    }
    
    //Using Recursion-------------------------------
    public static int lastIndex(int[] arr, int idx, int x){
    	
    	if(idx==arr.length)
    		return -1;
    	int faithLastIdx = lastIndex(arr, idx+1, x);
    	if(faithLastIdx==-1) {
    		if(arr[idx] == x)
    			return idx;
    		else
    			return -1;
    	}
    	else {
    		return faithLastIdx;
    	}

    }

}