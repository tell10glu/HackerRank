import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/closest-numbers
public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\n");
		int index = scanner.nextInt();
		scanner.nextLine();
		String input = scanner.nextLine();
		String[] tmpArray = input.split(" ");
		int [] array = new int[index];
		for(int i=0;i<index;i++){
			array[i] = Integer.parseInt(tmpArray[i]);
		}
		
		quickSort(array, 0, index-1);
		int minVal= Integer.MAX_VALUE;
		ArrayList<Integer> minIndex = new ArrayList<Integer>();
		for(int i=0;i<index-1;i+=1){
			int subtraction = Math.abs(array[i]-array[i+1]);
			if(subtraction<=minVal){
				if(subtraction!=minVal){
					minIndex.clear();
					
				}
				minIndex.add(i);
				minVal= subtraction;
			}
		}
		for(int i =0;i<minIndex.size();i++){
			System.out.print(array[minIndex.get(i)]);
			System.out.print(" ");
			System.out.print(array[minIndex.get(i)+1]);
			System.out.print(" ");
		}
		scanner.close();
	}
	static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}

}