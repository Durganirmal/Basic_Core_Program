package com.Basic_Core_Program;
import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a leap year:");
        int year=sc.nextInt();
        if(year>1000)
        {
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            {
                System.out.println( year + " is a leap year");
            }

            else
            {
                System.out.println( year + " is not a leap year");
            }
        }
	}

}
