package stringProblems;

import java.util.Scanner;

public class ToggleString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			if(ch>='a' && ch<='z') {
				char upperCaseChar = (char) ('A'+ch-'a');
				sb.setCharAt(i, upperCaseChar);
			}
			else {
				char lowerCaseChar = (char) ('a'+ch-'A');
				sb.setCharAt(i, lowerCaseChar);
			}
		}
		return sb.toString();
	}
}
