package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class PrintPreInPostFormat {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPreInPostFormatMethod(n);
    }

    public static void printPreInPostFormatMethod(int n){
    	if(n==0)
    		return;
        System.out.println("Pre" + n);
        printPreInPostFormatMethod(n-1);
        System.out.println("In" + n);
        printPreInPostFormatMethod(n-1);
        System.out.println("Post" + n);

    }

}