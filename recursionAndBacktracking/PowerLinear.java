package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));

    }

    public static int power(int x, int n){
        int result = 1;
        if(n==0)
            return 1;
        else
            result = x * power(x,n-1);
        return result;
    }

}