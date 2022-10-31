package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
        
    }

    public static int power(int x, int n){
        if(n==0)
            return 1;
        int result = 1;
        int xPowerNBy2 = power(x,n/2);
        result = xPowerNBy2 * xPowerNBy2;
        if(n%2==1) {
            result = xPowerNBy2 * xPowerNBy2 * x;
        }
        return result;
    }

}