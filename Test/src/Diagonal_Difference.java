
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal_Difference {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        System.out.println(absDiff(a, n));
    }
    
    public static int absDiff(int[][] array, int size){
        int sum1 = 0;
        int sum2 = 0; 
        int i = 0;
        int j = 0;
        while (i <= size-1){
            sum1 += array[i][j];
            //System.out.println(sum1);
            i++;
            j = i;
            
        }
        i = size-1;
        j = 0;
        
        while (i >= 0){
            sum2 += array[i][j];
            //System.out.println(i+", "+j);
            i--;
            j++;
            
            
        }
        int difference = ((sum2-sum1) > 0) ? (sum2-sum1): -(sum2-sum1);
        return difference;
    }

}
