import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Time_Conversion 
{
	
/*Given a time in a 12-hour AM/PM format, convert 
 *it to military (24-hour) time.*/
	
	static String timeConversion(String s) 
	{
        String decoy = "";
        if (s.charAt(8) == 'P')
        {
            if ((Integer.parseInt(s.substring(0,2)) == 12))
            {
                return s.substring(0,8);
            } else 
            {
            String hours = s.substring(0, 2); 
            int newHours = (Integer.parseInt(hours))+12;
            return newHours+s.substring(2, 8);
            }
        }
        if (s.charAt(8) == 'A')
        {
            if ((Integer.parseInt(s.substring(0,2)) == 12))
                {
                    return "00"+s.substring(2,8);
                } else 
                {
                    return s.substring(0, 8);
                }
        }
        return decoy;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
