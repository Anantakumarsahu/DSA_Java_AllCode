package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class GetStairsPathsUsingRecursion {

    public static void main(String[] args) throws Exception {
    	Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> words = getStairPaths(n);
        System.out.println(words);
    }

    public static ArrayList<String> getStairPaths(int n) {
    	if(n==0) { //for zero stair or when he is on the same stair
    		ArrayList<String> result = new ArrayList<String>();
    		result.add("");
    		return result;
    	} 
    	else if(n<0) {  //For negative stair, man cannot climb.
    		ArrayList<String> result = new ArrayList<String>();
    		return result;
    	}
    	//At a Single time the man is allowed to climb 1 step, 2 steps or 3 steps in one move.
    	//That's why we have taken n-1,n-2,n-3 (i.e; upto n-3 only)
    	//we have taken here 3 faiths
    	ArrayList<String> path1 =  getStairPaths(n-1);
    	ArrayList<String> path2 =  getStairPaths(n-2);
    	ArrayList<String> path3 =  getStairPaths(n-3);
    	ArrayList<String> resultantPaths = new ArrayList<String>();
    	
    	for(String path : path1) {
    		resultantPaths.add(1 + path);
    	}
    	for(String path : path2) {
    		resultantPaths.add(2 + path);
    	}
    	for(String path : path3) {
    		resultantPaths.add(3 + path);
    	}
    	
        return resultantPaths;
    }

}