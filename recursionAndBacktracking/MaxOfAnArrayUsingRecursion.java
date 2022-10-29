package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class MaxOfAnArrayUsingRecursion {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
        int index = 0;
        int result = maxOfArray(arr,index);
        System.out.println(result);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1) {
            return arr[idx];
        }
        int minFromFaith = maxOfArray(arr, idx+1);
        if(minFromFaith>arr[idx]) {
            return minFromFaith;
        }
        else
            return arr[idx];
    }

}