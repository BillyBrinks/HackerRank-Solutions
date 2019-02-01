import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Alice wrote a sequence of words in CamelCase as 
 *a string of letters, s, having the following properties:

  -It is a concatenation of one or more words consisting of 
  English letters.
  -All letters in the first word are lowercase.
  -For each of the subsequent words, the first letter is 
  uppercase and rest of the letters are lowercase.
  
  Given s, print the number of words in s on a new line.*/

public class CamelCase {

static int camelcase(String s) {
        
        int count = 1; 
       
        for (char c : s.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
