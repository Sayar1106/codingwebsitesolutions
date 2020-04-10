/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
		int cases = sc.nextInt();
		long[] outarr = new long[cases];
		for (int c = 0; c < cases; c++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; ++i) {
                arr[i] = sc.nextInt();
            }
            outarr[c] = prosum(arr);
        
		}
        for (int i = 0; i < outarr.length; i++){
            System.out.println(outarr[i]);
        }
	}
		
	
	
	public static long prosum(int[] arr){
	    int count_2 = 0;
	    int count_greater = 0;
	    for (int i = 0; i < arr.length; i++){
	        if(arr[i] ==  2) count_2++;
	        
	        else if (arr[i] > 2) count_greater++;
	    }
	    
	    long res = 1L * count_2 * count_greater + (1L * count_greater * (count_greater - 1))/2;
	        
	   return res; 
	}
}