import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Apple_and_Orange {
/*Visit https://www.hackerrank.com/challenges/apple-and-orange/copy-from/57753623
 * for detailed instructions. */
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int numApples= 0; 
        for (int i = 0; i < apple.length; i++)
        {
            if (apple[i]+a >= s && apple[i]+a <= t)
            {
                numApples +=1;
            }
        }
        int numOranges = 0;
        for (int i = 0; i < orange.length; i++)
        {
            if (orange[i]+b >= s && orange[i]+b <= t)
            {
                numOranges +=1;
            }
        }
        
        System.out.println(numApples+"\n"+numOranges);
    }
}
