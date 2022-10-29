package stringProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromList {
	public static void solution(ArrayList<Integer> al){
		for(int i=al.size()-1;i>=0;i--) {
			int n = al.get(i);
			if(isPrime(n)==true)
				al.remove(i);
		}
	}
	public static boolean isPrime(int a) {
		for(int div=2; div*div<=a; div++) {
			if(a%div==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
