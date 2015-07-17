import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	//https://www.hackerrank.com/challenges/extra-long-factorials
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        BigInteger sum = BigInteger.valueOf(1);
        for(int i =factorial;i>1;i--){
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
        scanner.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}