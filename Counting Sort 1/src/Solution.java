import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/countingsort1/submissions/code/12541701
public class Solution {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	scanner.useDelimiter("\\n");
    	int index = scanner.nextInt();
    	scanner.nextLine();
    	String input = scanner.nextLine();
    	int[] numberArray = new int[index];
    	int[] hashArray = new int[100];
    	String[] tmpArray = input.split(" ");
    	for(int i=0;i<tmpArray.length;i++){
    		numberArray[i] = Integer.parseInt(tmpArray[i]);
    		hashArray[numberArray[i]]++;
    	}
    	for(int i=0;i<numberArray.length;i++){
    		System.out.print(hashArray[i]);
    		System.out.print(" ");
    	}
    	
    	scanner.close();
    }
}