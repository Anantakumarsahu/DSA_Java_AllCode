package stringProblems;

import java.util.Scanner;

public class DifferenceOfTwoCharacter {
	public static String solution(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=1;i<str.length();i++) {
			char previous = str.charAt(i-1);
			char current = str.charAt(i);
			int gap = current-previous;
			sb.append(gap);
			sb.append(current);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(solution(str));
	}

}
