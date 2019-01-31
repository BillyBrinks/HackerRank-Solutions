import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*You are in charge of the cake for your niece's birthday and 
 *have decided the cake will have one candle for each year of 
 *her total age. When she blows out the candles, she’ll only 
 *be able to blow out the tallest ones. Your task is to find 
 *out how many candles she can successfully blow out.

  For example, if your niece is turning 4 years old, and the 
  cake will have 4 candles of height 4, 4, 1, 3, she will be 
  able to blow out 2 candles successfully, since the tallest 
  candles are of height 4 and there are 2 such candles.*/

public class Birthday_Cake_Candles {

	static int birthdayCakeCandles(int n, int[] ar) 
    {
        if (allEqual(n, ar))
        {
            return n;
        }
        
        int largest = ar[0]; 
        
        for (int i = 0; i < n; i++)
        {
            if (ar[i] > largest)
            {
                largest = ar[i];
            }
        }
        int candleCount = 0;
        for (int i = 0; i < n; i++)
        {
            if (ar[i] == largest)
            {
                candleCount++;
            }
        }
        return candleCount;
    }
    
    public static boolean allEqual(int n, int[] arr){
        for (int i = 0; i < n-2; i++)
        {
            if (arr[i] != arr[i+1])
            {
                return false;
            }  
        }
        return true;
    } 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
