import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Compare_the_Triplets {
	
	/*Alice and Bob each crerated a problem for HackerRank.
	 *A reviewer rates the two challenges, awarding points
	 *on a scale from 1 - 100 for three categories: 
	 *clarity, originality and difficulty.
	 *
	 *We define the rating for Alice's challenge as a triplet
	 *a = (a[0], a[1], a[2]), and the rating for Bob's challenge
	 *as the corresponding triplet for 'b'.
	 *
	 *Your task: fid their comparison points by comparing
	 *a[0] with b[0], a[1] with b[1], and so on. 
	 *
	 *If in any comparison either is found to have scored higher,
	 *the person with the higher score earns 1 point.
	 *
	 *Given triplets a and b, determine their respective comparison points.
	 *
	 *Your method should return a 1d array of size 2 with the 
	 *comparison points for each person inside.*/

	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2)
    {
        int[] result = new int[2]; 
        if (a0>b0)
        {
            result[0] = 1; 
        } else if (a0<b0)
        {
            result[1] = 1;
        } else 
        {
            //do nothing
        }
        if (a1>b1)
        {
            result[0] += 1;
        } else if (a1 < b1){
            result[1] += 1; 
        } else 
        {
            //do nothing
        }
        if (a2>b2)
        {
            result[0] += 1;
        } else if (a2<b2)
        {
            result[1] += 1;
        } else 
        {
            //do nothing
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
