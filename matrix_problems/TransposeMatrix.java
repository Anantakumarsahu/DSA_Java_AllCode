package matrix_problems;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    int i,j;
		    int rows = sc.nextInt();
		    int column = sc.nextInt();
		    int arr[][] = new int[rows][column];
		    for(i=0;i<rows;i++) {
		        for(j=0;j<column;j++) {
		            arr[i][j] = sc.nextInt();
		        }
		    }
		    for(i=0;i<arr.length;i++) {
		    	for(j=i;j<arr[0].length;j++) {
		    		int temp = arr[i][j];
		    		arr[i][j] = arr[j][i];
		    		arr[j][i] = temp;
		    	}
		    }
		    matrixDisplay(arr);

	}
	public static void matrixDisplay(int[][] arr){
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[0].length; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
   }
}
