import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {
/*You are choreographing a circus show with various animals. 
 *For one act, you are given two kangaroos on a number line 
 *ready to jump in the positive direction (i.e, toward positive infinity).
 *
 *The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 *The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
 *
 *You have to figure out a way to get both kangaroos at the same location at the same 
 *time as part of the show. If it is possible, return YES, otherwise return NO.*/
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
		//crudely exploit the fact that we're only dealing with ints...
        while (x1 <= 100000000 && x2 <= 100000000)
        {
            if (x1 == x2)
            {
                return "YES";
            }
            
            x1 += v1;
            x2 += v2;
        }
        
        return "NO";
           
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
