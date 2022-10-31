package recursionAndBacktracking;

import java.io.*;
import java.util.*;

public class GetMazePathUsingRecursion {

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int rows = sc.nextInt();
    	int columns = sc.nextInt();
    	ArrayList<String> maze = getMazePaths(1, 1, rows, columns);
    	System.out.println(maze);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    	if(sr==dr && sc==dc) { //when destination row and column are same as source.
    		ArrayList<String> currentMaze = new ArrayList<String>();
    		currentMaze.add("");
    		return currentMaze;
    	} 

    	ArrayList<String> horizontalPreviousMazes = new ArrayList<>();
    	if(sc<dc) 
    		horizontalPreviousMazes = getMazePaths(sr, sc+1, dr, dc);
    	ArrayList<String> verticalPreviousMazes =  new ArrayList<>();
    	if(sr<dr)
    		verticalPreviousMazes = getMazePaths(sr+1, sc, dr, dc);
    	ArrayList<String> currentMaze = new ArrayList<>();
    	for(String str : horizontalPreviousMazes) {
    		currentMaze.add("h" + str);
    	}
    	for(String str : verticalPreviousMazes) {
    		currentMaze.add("v" + str);
    	}
        return currentMaze;
    }

}