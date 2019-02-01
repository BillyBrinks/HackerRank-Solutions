import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! 
 *There are a number of people queued up, and each person wears a sticker indicating 
 *their initial position in the queue. Initial positions increment by 1 from 1 at the 
 *front of the line to n at the back.

  Any person in the queue can bribe the person directly in front of them to swap 
  positions. If two people swap positions, they still wear the same sticker denoting 
  their original places in line. One person can bribe at most two others. For example, 
  if n = 8 and Person 5 bribes Person 4, the queue will look like this: 
  1, 2, 3, 5, 4, 6, 7, 8.

  Fascinated by this chaotic queue, you decide you must know the minimum number of 
  bribes that took place to get the queue into its current state!

  Function Description

  Complete the function minimumBribes in the editor below. 
  It must print an integer representing the minimum number of bribes necessary, 
  or "Too chaotic" if the line configuration is not possible.*/

public class New_Year_Chaos {
	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
            int numBribes = 0;

            for (int i = q.length-1; i >= 0; i--){
                if (q[i] - (i+1) > 2){
                    System.out.println("Too chaotic");
                    return;
                }

                for (int j = Math.max(0, q[i] - 2); j < i; j++){
                    if (q[j] > q[i]){
                        numBribes++;
                    }
                }
            }
            System.out.println(numBribes);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
