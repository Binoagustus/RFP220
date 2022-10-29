package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class PalindromeWhileloop {

	public static void main(String[] args) {
		int num,reverse = 0;
		Scanner pl = new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		num = pl.nextInt();
		int testpalindrome = num;
		while(num!=0) {
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder; //1st iteration 1, 2nd iteration 13, 3rd iteration 132  
			num = num/10;  
		}
		System.out.println("Reverse of the number is "+reverse);
		if(testpalindrome == reverse) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
	}

}
