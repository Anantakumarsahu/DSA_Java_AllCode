package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class GetKpcUsingRecursion {

    public static void main(String[] args) throws Exception {
    	Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList< String> words = getKPC(str);
        System.out.println(words);
      }
      
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};                                                        //#
     
    public static ArrayList<String> getKPC(String str) {
    	if(str.length() == 0) {
    		ArrayList<String> result = new ArrayList<String>();
    		result.add("");
    		return result;
    	}
    	char firstCharOfString = str.charAt(0);
    	String strSubString = str.substring(1);
    	ArrayList<String> getKpcOfPrevious = getKPC(strSubString);
    	ArrayList<String> resultantString = new ArrayList<String>();
    	String strOfCodes = codes[firstCharOfString-'0'];
    	for(int i=0;i<strOfCodes.length();i++) {
    		char charOfCodes = strOfCodes.charAt(i);
    		for(String ans : getKpcOfPrevious) {
        		resultantString.add(charOfCodes+ans);
        	}
    	}
    	
        return resultantString;
    }

}