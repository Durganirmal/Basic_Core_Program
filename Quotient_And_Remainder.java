package com.Basic_Core_Program;

import java.util.Scanner;
public class Quotient_And_Remainder {

	public static void main(String[] args) {
		int dividend, divisor, quotient, remainder;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the dividend");
		dividend = sc.nextInt();

		System.out.println("Enter the divisor");
		divisor = sc.nextInt();
		sc.close();

		quotient = dividend / divisor;
		remainder = dividend % divisor;

		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
	}

}


