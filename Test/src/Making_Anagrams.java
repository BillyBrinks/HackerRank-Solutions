import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Making_Anagrams {
	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	  StringBuilder first = new StringBuilder(a);
          StringBuilder second = new StringBuilder(b);
          
          for (int i = 0; i < first.length(); i++) {
              if(contains(first.charAt(i), second)) {
                  first.deleteCharAt(i);
                  i--;
              }
          }
          
          for (int i = 0; i < second.length(); i++) {
              if(contains(second.charAt(i), first)) {
                  second.deleteCharAt(i);
                  i--;
              }
          }
         
          return first.length() + second.length();
      }
      
      static boolean contains (char x, StringBuilder s) { 
          for (int i = 0; i < s.length(); i++) {
              if (s.charAt(i) == x) {
                  s.deleteCharAt(i);
                  return true;
              }
          }
          return false;
      }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
