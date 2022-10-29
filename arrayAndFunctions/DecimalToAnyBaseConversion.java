package arrayAndFunctions;

import java.util.Scanner;

public class DecimalToAnyBaseConversion {
	
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	  
	   public static int getValueInBase(int n, int b){
	       int finalValue = 0;
	       int power = 1;
	       while(n>0) {
	    	   int rem = n % b;
	    	   int div= n / b;
	    	   n = div;
	    	   finalValue = finalValue + (rem*power);
	    	   power = power * 10;
	    	   
	       }
	       
	       return finalValue;
	   }

}
