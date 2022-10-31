package stringProblems;

import java.util.Scanner;

public class stringPermutation {
	
	public static void solution(String str){
		int length = str.length();
		int fact = factorial(length);
		for(int i=0;i<fact;i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for(int div=length; div>=1; div--) {
				int qoutient = temp / div;
				int remainder = temp % div;
				System.out.print(sb.charAt(remainder));
				sb.deleteCharAt(remainder);//to delete the characher after printing
				temp = qoutient;
			}
			System.out.println();
		
		}
		
		
	}
	public static int factorial(int n) {
		int result = 1;
		for(int i=2;i<=n;i++) {
			result = result*i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
