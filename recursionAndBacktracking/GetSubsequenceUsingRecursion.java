package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class GetSubsequenceUsingRecursion {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = gss(str);
        System.out.println(result);
    }
    //For abc
    //bc = [--,-b,-c,bc]
    //abc = [---,--b,--c,-bc,a--,a-b,a-c,abc]
    public static ArrayList<String> gss(String str) {
    	if(str.length()==0) {
    		ArrayList<String> finalSubsequence = new ArrayList<String>();
    		finalSubsequence.add("");
    		return finalSubsequence;
    	}
    	char firstCharOfString = str.charAt(0);
    	ArrayList<String> firstSubsequence = gss(str.substring(1));//for->bc = [--,-b,-c,bc]
    	ArrayList<String> finalSubsequence = new ArrayList<String>();
        for(String answer : firstSubsequence) {
        	finalSubsequence.add(""+answer);
        }
        for(String answer : firstSubsequence) {
        	finalSubsequence.add(firstCharOfString+answer);
        }
    	return finalSubsequence;
    }

}