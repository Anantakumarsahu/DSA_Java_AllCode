package matrix_problems;
import java.util.Scanner;

public class SpiralMatrix {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[rows][column];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<column;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minc = 0;
        int minr = 0;
        int maxc = (arr[0].length-1);
        int maxr = (arr.length-1);
        int totalElements = rows*column;
        int count=0;
        while(count<totalElements) {
            for(int i=minr, j=minc;i<=maxr && count<totalElements;i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            for(int i=maxr, j=minc;j<=maxc && count<totalElements;j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            for(int i=maxr, j=maxc;i>=minr && count<totalElements;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            for(int i=minr, j=maxc;j>=minc && count<totalElements;j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }

    }

}
