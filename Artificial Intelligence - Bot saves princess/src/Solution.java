import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	static void displayPathtoPrincess(int n, String[] grid) {
		int positionXOfMan = -1;
		int positionYOfMan = -1;
		int positionXOfPrincess;
		int positionYOfPrincess;
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n;j++){
				if(grid[i].charAt(j)=='m'){
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
			for(int j=0;j<m;j++){
			
			}
		}

		displayPathtoPrincess(m, grid);
		in.close();
	}
}
