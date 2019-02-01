import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Coin_Change_Problem {
/*You are working at the cash counter at a fun-fair, 
 * and you have different types of coins available to 
 * you in infinite quantities. The value of each coin 
 * is already given. Can you determine the number of 
 * ways of making change for a particular number of 
 * units using the given types of coins?*/
	
	 static long getWays(long n, long[] coins)
	    {   
	        long[] ways = new long[(int)n+1];
	        ways[0] = 1;
	        
	        for (long coin : coins)
	        {
	            for (int i = 1; i < ways.length; i++)
	            {
	                if (i >= coin)
	                {
	                    ways[i] += ways[i - (int)coin];
	                }
	            }
	            
	        }
	        return ways[(int)n];
	    }
	    
	    public static void printArray(long[] ways)
	    {
	        for (long way : ways)
	        {
	            System.out.print(way+" ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        long[] c = new long[m];
	        for(int c_i=0; c_i < m; c_i++){
	            c[c_i] = in.nextLong();
	        }
	        /* Print the number of ways of making change for 
	         * 'n' units using coins having the values given by 'c'
	         */
	        System.out.println(getWays(n, c));
	    }
}
