import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*You are given an unordered array consisting of 
 *consecutive integers [1, 2, 3, ..., n] without any duplicates. 
 *You are allowed to swap any two elements. You need to find the 
 *minimum number of swaps required to sort the array in ascending order.*/

public class Minimum_Swaps {
	
	/*Instead of sorting the array, we simply iterate through,
	 *checking to see if any elements are not where they belong.
	 *If an element is out of place, measure it's distance from
	 *where it belongs and add that number to minSwaps.
	 *
	 *This way we simulate the fastest way to sort the array, 
	 *which is the way a human would do it: eyeballing it.*/
	
	static int minimumSwaps(int[] arr) {
        int minSwaps = 0; 
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != i + 1){
                int a = arr[arr[i]-1];
                int b = arr[i];

                arr[arr[i] - 1] = b;
                arr[i] = a;
                minSwaps++;
                i--;
            }
        }
        return minSwaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
