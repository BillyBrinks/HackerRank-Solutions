import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Starting with a 1-indexed array of zeros and a list of operations, 
 * for each operation add a value to each of the array element between 
 * two given indices, inclusive. Once all operations have been 
 * performed, return the maximum value in your array.*/

public class Array_Manipulation {
	 // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
            int a, b, k = 0;
            long biggest = 0L; 
            long currSlope = 0L;
            long[] array = new long[n];
            /*To save space and time, we only measure overall "height", 
             * or "slope" of the array as values are added instead of 
             * actually adding the values. In this way we achieve 
             * complexity O(n+m) as opposed to O(nm). */
            
            for (int i = 0; i < queries.length; i++){
                    a = queries[i][0];
                    b = queries[i][1];
                    k = queries[i][2];
                    
                    /*This indicator tells us later on that everything to the
                     * right of this cell inclusive has +k until we get to b*/
                    array[a-1]+=k;
                    
                    /*this if statement silently deals with additions to the
                     * last element of the array and saves us from an 
                     * IndexOutofBounds Exception.*/ 
                    if (b == n){
                        
                    } else {
                    	/*This indicator tells us that every cell to the right
                    	 * of this one has -k (relative to a through b)*/
                        array[b]-=k;
                    }
            }
            //find the highest point of the array and return it, done!
            for (long x : array){
                currSlope += x;
                biggest = Math.max(biggest, currSlope);
            }
            return biggest;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
