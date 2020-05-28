// @author Sayar Banerjee
// @since 28-05-2020
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
		 Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases > 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; ++i) {
                arr[i] = sc.nextInt();
            }
            int countInv = 0;
    	    int countLocalInv = 0;
    	    for(int i = 0; i < arr.length - 1; i++){
    	        if(arr[i] > arr[i+1]) countLocalInv++;
    	        for(int j = i + 1; j < arr.length; j++)
    	            if(arr[i] > arr[j]) countInv++;
    	    }
    	    if(countInv == countLocalInv) System.out.println("YES");
    	    else System.out.println("NO");
    	    
    	    cases--;
        }
	}
}
	
