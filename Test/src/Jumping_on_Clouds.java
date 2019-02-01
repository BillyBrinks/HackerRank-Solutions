import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Emma is playing a new mobile game that starts with 
 *consecutively numbered clouds. Some of the clouds 
 *are thunderheads and others are cumulus. She can 
 *jump on any cumulus cloud having a number that is 
 *equal to the number of the current cloud plus 1 or 2. 
 *She must avoid the thunderheads. Determine the minimum 
 *number of jumps it will take Emma to jump from her 
 *starting postion to the last cloud. 
 *It is always possible to win the game.*/

public class Jumping_on_Clouds 
{
	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) 
    {
        int numJumps = 0;

        for (int i = 0; i < c.length; i++)
        {
            if (i < c.length-2)
            {
                if(c[i+2] == 0)
                {
                i++;
                numJumps++;
                } else if (c[i+1] == 0)
                {
                    numJumps++;
                }
            } else if(i != c.length-1)
            {
                numJumps++;
            }
            //numJumps++;
        }
        return numJumps;

   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
