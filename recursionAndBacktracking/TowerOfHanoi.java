package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the tower you want to arrange");
        int n = sc.nextInt();
        System.out.println("Enter All the Three Towers :- ");
        int tower1 = sc.nextInt();
        int tower2 = sc.nextInt();
        int tower3 = sc.nextInt();
        toh(n,tower1,tower2,tower3);

    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0) {
            return;
        }
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n-1,t3id,t2id,t1id);
    }

}