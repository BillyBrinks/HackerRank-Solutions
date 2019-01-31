import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mini_Max_Sum {

	
/*Given five positive integers, find the minimum and maximum values 
	that can be calculated by summing exactly four of the five integers. 
	Then print the respective minimum and maximum values as 
	a single line of two space-separated long integers.*/
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long bigNum = arr[0];
        int i;
        long lilNum = arr[0];
        long bigSum = 0;
        long lilSum = 0;
        //get biggest num
        
        if (allEqual(arr))
        {
            System.out.println(arr[0]*4+" "+arr[0]*4);
            return;
        }
        
        for (i = 0; i <= 4; i++)
        {
            if (bigNum<arr[i])
            {
                bigNum = arr[i];
            }
        }
        //get smallest num
        for (i = 0; i <= 4; i++)
        {
            if (lilNum > arr[i])
            {
                lilNum = arr[i];
            }
        }
        //get smallest sum
        for (i = 0; i <= 4; i++)
        {
            if (arr[i] != bigNum)
            {
                lilSum += arr[i];
            }
        }
        //get biggest sum
        for (i = 0; i <= 4; i++)
        {
            if (arr[i] != lilNum)
            {
                bigSum += arr[i];
            }
        }
        
        System.out.println(lilSum+" "+bigSum);
        
    }
    
    public static boolean allEqual(int[] arr)
    {
        boolean equal = false; 
        
        for (int i = 0; i < 4; i++)
        {
            if (arr[i] != arr[i+1])
            {
                return false; 
            }
        }
        return true; 
    }
	
	
}
