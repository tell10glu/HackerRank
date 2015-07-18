import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N,M,a,b,k;

    	N = scanner.nextInt();
    	M = scanner.nextInt();
    	long maxVal = Long.MIN_VALUE;
    	HashMap<Integer, Long> aMap = new HashMap<Integer, Long>();
    	HashMap<Integer,Long> bMap = new HashMap<Integer, Long>();
    	
    	for(int i=0;i<M;i++){
    		a = scanner.nextInt();
    		b = scanner.nextInt();
    		k = scanner.nextInt();
    		a--;
    		//b--; ?
    		if(aMap.containsKey(a)){
    			aMap.put(a, aMap.get(a)+k);
    		}else{
    			aMap.put(a, (long) k);
    		}
    		if(bMap.containsKey(b)){
    			bMap.put(b, bMap.get(b)-k);
    		}else{
    			bMap.put(b, (long) -k);
    		}
    	}
    	long val = 0;
    	for(int i=0;i<N;i++){
    		if(aMap.containsKey(i)){
    			val+= aMap.get(i);
    		}
    		if(bMap.containsKey(i)){
    			val+=bMap.get(i);
    		}
    		if(val>maxVal){
    			maxVal = val;
    		}
    	}
    	System.out.println(maxVal);
    	
    	scanner.close();
    }
}