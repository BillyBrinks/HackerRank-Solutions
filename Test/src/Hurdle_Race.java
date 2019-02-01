import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hurdle_Race {
/*Dan is playing a video game in which his character competes 
 *in a hurdle race. Hurdles are of varying heights, and Dan 
 *has a maximum height he can jump. There is a magic potion 
 *he can take that will increase his maximum height by 1 unit 
 *for each dose. How many doses of the potion must he take to 
 *be able to jump all of the hurdles?

  Given an array of hurdle heights 'height', and an initial 
  maximum height Dan can jump, k, determine the minimum 
  number of doses Dan must take to be able to clear all 
  the hurdles in the race.
  
  For example, if height = [1,2,3,3,2] and Dan can jump 1 unit 
  high naturally, he must take 3 - 1 = 2 doses of potion to 
  be able to jump all of the hurdles.*/
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int highest = 0;
        for (int i = 0; i < n-1; i++)
        {
            if (highest < height[i])
            {
                highest = height[i];
            }
        }
        if (highest-k <= 0)
        {
            System.out.println(0);
        } else
        {
          System.out.println(highest - k);  
        }
        
    }
}
