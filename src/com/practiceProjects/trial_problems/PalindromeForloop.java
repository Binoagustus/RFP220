package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class PalindromeForloop {
	public static void main(String[] args) {
		int number,reverse;
		Scanner pl = new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		number = pl.nextInt();
		int test_palindrome = number;
		System.out.println("Reverse of number "+number+" is ");
		for(reverse=0; number!=0;) {
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder; //1st iteration 1, 2nd iteration 13, 3rd iteration 132  
			number = number/10;  
		}
		System.out.println(reverse);
		if(test_palindrome == reverse) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
	}
}
