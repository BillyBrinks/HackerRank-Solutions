import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Between_Two_Sets {
	/*You will be given two arrays of integers and asked to 
	 *determine all integers that satisfy the following two conditions:

	-The elements of the first array are all factors of the integer being considered
	-The integer being considered is a factor of all elements of the second array
	
	These numbers are referred to as being between the two arrays. 
	You must determine how many such numbers exist.*/
	
	static int getTotalX(int[] a, int[] b) {
        int total = 0;
        int bCount = 0;
        int aCount = 0;
        int x = 0;
        for (x = a[a.length-1]; x <= b[0]; x++)
        {
           
            for (int i = 0; i < a.length; i++)
           {
               if (x%a[i] == 0)
               {
                  aCount++;                 
               }
           }
           
            for (int i = 0; i < b.length; i++)
           {
               if (b[i]%x == 0)
               {
                  bCount++;
               }
           }
          
            if ((bCount == b.length) && (aCount == a.length))
           {               
               total++;
           }
           
           aCount = 0;
           bCount = 0;
        }
        
        return total;
}
           
           
        
        
        
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }

}
