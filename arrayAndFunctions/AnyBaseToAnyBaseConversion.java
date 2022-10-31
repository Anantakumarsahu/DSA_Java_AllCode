package arrayAndFunctions;

import java.util.Scanner;

//To convert a Number from any base to any other base,
//first Convert that number into decimal base
//And then convert from decimal to any base

public class AnyBaseToAnyBaseConversion {
	
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	     int  destBase= scn.nextInt();
	     int valueGetInDecimalBase = getValueIndecimal(n, sourceBase);
	     int valueGetInOtherBaseFromDecimal = getValueInBase(valueGetInDecimalBase, destBase);
	     System.out.println(valueGetInOtherBaseFromDecimal);
	   } 
	
	//Convert the number from sourceBase to The decimalBase Number...........
	 public static int getValueIndecimal(int n, int sourceBase){
	      int finalvalue = 0;
	      int pow = 1;
	      while(n>0) {
	    	  int remainder = n % 10;
	    	  int lastDigit = n/10;
	    	  n=lastDigit;
	    	  finalvalue = finalvalue + (remainder*pow);
	    	  pow = pow * sourceBase;
	      }
	      return finalvalue;
	   }
	 
	//Convert the decimalBase number from decimalBase to The  FinalBaseNumber.................
	 public static int getValueInBase(int n, int destBase){
	       int finalValue = 0;
	       int power = 1;
	       while(n>0) {
	    	   int rem = n % destBase;
	    	   int div= n / destBase;
	    	   n = div;
	    	   finalValue = finalValue + (rem*power);
	    	   power = power * 10;
	    	   
	       }
	       
	       return finalValue;
	   }

}
