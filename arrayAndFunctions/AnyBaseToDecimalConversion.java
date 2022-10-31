package arrayAndFunctions;

import java.util.Scanner;

public class AnyBaseToDecimalConversion {
	
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int d = getValueIndecimal(n, b);
	      System.out.println(d);
	   }
	  
	   public static int getValueIndecimal(int n, int b){
	      int finalvalue = 0;
	      int pow = 1;
	      while(n>0) {
	    	  int remainder = n % 10;
	    	  int lastDigit = n/10;
	    	  n=lastDigit;
	    	  finalvalue = finalvalue + (remainder*pow);
	    	  pow = pow * b;
	      }
	      return finalvalue;
	   }

}
