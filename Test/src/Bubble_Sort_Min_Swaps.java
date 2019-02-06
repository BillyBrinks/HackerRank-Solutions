import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bubble_Sort_Min_Swaps {
	
	static boolean isSorted(int[] arr) {
		boolean sorted = true;
		
		for (int i = 0; i < arr.length; i ++) {
			if (i == arr.length - 1) {
				break;
			}
			
			if (arr[i] > arr[i + 1]) {
				sorted = false;
				break;
			}
		}
		
		return sorted;
	}
	
	static void countSwaps(int[] a) {
        int numSwaps = 0;  

       while (!isSorted(a)) {
        for (int i = 0; i < a.length; i++){
            if (i == a.length-1){
                break;
            }

            int x = a[i];
            int y = a[i+1];

            if(x > y){
                a[i] = y;
                a[i+1] = x;
                numSwaps++; 
            }

        }
       }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);

    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
