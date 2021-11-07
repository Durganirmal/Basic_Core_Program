package com.Basic_Core_Program;

public class Flip_coin {
	public static void main(String[] args) {
		double coin = (int) (Math.random() * 10) % 2;
		//System.out.println("Welcome to Basic Core Program");
		if (coin == 1) {
			System.out.println("Head");
		} else {
			System.out.println("Tail");
		}
}
}