package matrix_problems;

import java.util.Scanner;

//In Order to rotate90Degree a matrix, at first we have to make its transpose and then we have to reverse the transpose.
//Then we will get the final matrix which will be the 90degreeRotation of the original Input Matrix
public class RotateBy90Degree {

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
		    //Transpose................................
		    for(i=0;i<arr.length;i++) {
		    	for(j=i;j<arr[0].length;j++) {
		    		int temp = arr[i][j];
		    		arr[i][j] = arr[j][i];
		    		arr[j][i] = temp;
		    	}
		    }
		    
		    //Reverse of Transpose Matrix((0DegreeRotation Matrix)..................
		    for(i=0;i<arr.length;i++) {
		    	int leftIndex = 0;
		    	int rightIndex = arr[i].length-1;
		    	while(leftIndex<rightIndex) {
		    		int temp = arr[i][leftIndex];
		    		arr[i][leftIndex] = arr[i][rightIndex];
		    		arr[i][rightIndex] = temp;
		    		leftIndex++;
		    		rightIndex--;
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
