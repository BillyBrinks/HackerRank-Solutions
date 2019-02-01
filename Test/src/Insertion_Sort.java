import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Insertion_Sort {

	public static void insertIntoSorted(int[] ar) {
        
        int n = ar.length;
        int e = ar[n-1];
        
        
        for (int i = ar.length-2; i >= 0; i--)
        {
            if (ar[i] > e)
            {
                ar[i+1] = ar[i];
                printArray(ar);
            } else if (ar[i] <= e)
            {
                ar[i+1] = e;
                printArray(ar);
                break;
            }
            
            if (i == 0 && ar[i] >= e)
            {
                ar[i] = e;
                printArray(ar);
            }
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }

}
