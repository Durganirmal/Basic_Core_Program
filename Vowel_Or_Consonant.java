package com.Basic_Core_Program;

import java.util.Scanner;
public class Vowel_Or_Consonant {

	 public static void main(String[] args) {
	        Scanner y =new Scanner(System.in);
	        System.out.println("Enter the alphabet is vowels or consonant:");
	        char alp =y.next().charAt(0);
	        if(alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u')
	                 System.out.println("The character "+ alp +"  is vowel");
	        else
	                System.out.println("The character "+ alp +"  is Consonant");
	        }
	}
	


