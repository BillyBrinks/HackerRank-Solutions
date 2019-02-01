import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grading_Students {
	
	/*HackerLand University has the following grading policy:
	 *every student receives a grade in the inclusive range from 0 - 100.
	 *any grade less than 40 is a failing grade.
	 *
	 *Sam is a professor at the university and likes to round
	 *each student's grade according to these rules: 
	 *- If the difference between the grade and the next multiple of 5
	 *is less than 3, round grade up to next multiple of 5.
	 *- If value of grade is less than 38, do nothing and 
	 *the student fails.
	 *
	 *E.g., an 84 will round to an 85, but a 32 will remain a 32
	 *because the rounded number would be less than 40.
	 *
	 *Given the initial values of grades for each of his student's,
	 *write a program which automates this rounding process
	 *for Sam.*/
	
	static int[] solve(int[] grades){
        int[] newGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i] < 38)
            {
                newGrades[i] = grades[i];
            } else if ((5-(grades[i]%5)) < 3)
            {
                newGrades[i] = grades[i]+(5-(grades[i]%5));
            } else 
            {
                newGrades[i] = grades[i];
            }
        }
        return newGrades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
