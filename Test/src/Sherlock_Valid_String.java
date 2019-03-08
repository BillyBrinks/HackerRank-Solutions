import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sherlock_Valid_String {
	// Complete the isValid function below.
    static String isValid(String s) {
        int[] alphabet = new int[26];

        //boring for loop to make the alphabet frequency array
        for (char c : s.toCharArray()){
            if (c == 'a'){
                alphabet[0]++;
            } else if (c == 'b'){
                alphabet[1]++;
            } else if (c == 'c'){
                alphabet[2]++;
            } else if (c == 'd'){
                alphabet[3]++;
            } else if (c == 'e'){
                alphabet[4]++;
            } else if (c == 'f'){
                alphabet[5]++;
            } else if (c == 'g'){
                alphabet[6]++;
            } else if (c == 'h'){
                alphabet[7]++;
            } else if (c == 'i'){
                alphabet[8]++;
            } else if (c == 'j'){
                alphabet[9]++;
            } else if (c == 'k'){
                alphabet[10]++;
            } else if (c == 'l'){
                alphabet[11]++;
            } else if (c == 'm'){
                alphabet[12]++;
            } else if (c == 'n'){
                alphabet[13]++;
            } else if (c == 'o'){
                alphabet[14]++;
            } else if (c == 'p'){
                alphabet[15]++;
            } else if (c == 'q'){
                alphabet[16]++;
            } else if (c == 'r'){
                alphabet[17]++;
            } else if (c == 's'){
                alphabet[18]++;
            } else if (c == 't'){
                alphabet[19]++;
            } else if (c == 'u'){
                alphabet[20]++;
            } else if (c == 'v'){
                alphabet[21]++;
            } else if (c == 'w'){
                alphabet[22]++;
            } else if (c == 'x'){
                alphabet[23]++;
            } else if (c == 'y'){
                alphabet[24]++;
            } else if (c == 'z'){
                alphabet[25]++;
            }
        }
        
        int tmp = 0; 
        boolean subtracted = false;

        for (int x : alphabet){
            if (x == 0){
                //nothing here, ignore this cell and move on
                continue;
            } else if (tmp == 0){
                //this is the first nonzero number encountered.
                //all subsequent nonzero numbers must be equal to
                //or greater than this number by no more than 1,
                //so store it and move on
                tmp = x; 
                continue;
            }

            if (x == tmp){
                //this cell passes muster, move on
                continue;
            } else if ((x-1 == tmp && subtracted == false) || (subtracted == false && x == 1)){
                //this cell contains either a number greater than tmp
                //by exactly 1, or just the number 1, which also works.
                //so set subtracted to true to avoid accidentally 
                //doing this step more than once, and move on
                subtracted = true;
                continue;
            } else {
                //whatever was here, either subtracting 1 from it
                //failed to give us tmp or we'd already
                //done a subtraction, so return 'no' and exit
                return "NO";
            }

        }

        //we made it!
        return "YES";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
