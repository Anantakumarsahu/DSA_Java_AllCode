package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class PrintPermutaionUsingRecursion {

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0) {
        	System.out.println(asf);
        	return;
        }
        for(int i=0;i<str.length();i++) {
        	char currentCharacter = str.charAt(i);
        	String leftQstnPart = str.substring(0, i); //leftPart of current Character
        	String rightQstnPart = str.substring(i+1); //rightPart of current Character
        	String returnQuestion = leftQstnPart+rightQstnPart;
        	printPermutations(returnQuestion, asf+currentCharacter);
        }
    }

}