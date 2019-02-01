import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Lilah has a string, s, of lowercase English letters 
 *that she repeated infinitely many times.

  Given an integer, n, find and print the number of 
  letter a's in the first n letters of Lilah's infinite string.*/

public class Repeated_String {
	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
        long numAs = 0L;
        if (n < s.length()){
            long count = 0L;
            for (char c : s.toCharArray()){
                if (c == 'a'){
                    numAs++;
                }
                count++;
                if (count == n){
                    break;
                }
            }
            return numAs;
        } else if (s.length() == n){
            for (char c : s.toCharArray()){
                if (c == 'a'){
                    numAs++;
                }
            }
            return numAs;
        } else if (n > s.length()){
            long numReps = n/s.length();
            for (char c : s.toCharArray()) {
                if (c == 'a') {
                    numAs++;
                }
            }
            numAs = numAs*numReps;
            for (long i = 0L; i < n-numReps*s.length(); i++){
                if (s.charAt((int)i) == 'a'){
                    numAs++;
                }
            }
        }
        
        return numAs;
}
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
