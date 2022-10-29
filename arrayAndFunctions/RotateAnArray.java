package arrayAndFunctions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateAnArray {
	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }
	
	public static void reverse(int[] a, int lowIndex, int highIndex){
	    int high = highIndex;
	    int low = lowIndex;
	    while(low<=high) {
	    	int temp = a[low];
	    	a[low] = a[high];
	    	a[high] = temp;
	    	low++;
	    	high--;
	    }
	  }

	  public static void rotate(int[] a, int k){
		  k=k%a.length; //In order to handle larger k size
		  if(k<0) { //When k is negative, turn it into positive
		    	k=k+a.length;
		    }
		    reverse(a,0,(a.length-k-1)); //Part1
		    reverse(a, a.length-k, a.length-1); //Part2
		    reverse(a,0,a.length-1); //Combine Part1 and Part2
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    rotate(a, k);
	    display(a);
	 }

}
