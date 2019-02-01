import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*John works at a clothing store. He has a large pile 
 *of socks that he must pair by color for sale. Given 
 *an array of integers representing the color of each 
 *sock, determine how many pairs of socks with matching 
 *colors there are.

  For example, there are 7 socks with colors ar = [1, 2, 1, 2, 1, 3, 2]. 
  There is one pair of color 1 and one of color 2. 
  There are three odd socks left, one of each color. 
  The number of pairs is 2.*/

public class Sock_Merchant {

	// Complete the sockMerchant function below.
	
	//utility method to check whether a color has been seen
    static boolean arrcontains(int x, int[] arr)
    {
            for (int y : arr)
            {
                if(y == x)
                {
                    return true;
                }
            }
            return false;
    }

    static int sockMerchant(int n, int[] ar) 
    {
            int numpairs = 0;
            int count = 0; 
            int[] seen = new int[n];
            for (int i = 0; i < n; i++)
            {
                int sock = ar[i];
                if(arrcontains(sock, seen))
                {

                } else 
                {
                    for (int y : ar)
                    {
                        
                        if (y == sock)
                        {
                            count++;
                        }
                    }
                    
                    seen[i] = ar[i];
                }
                numpairs += count/2;
                count = 0;
            }
            return numpairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
