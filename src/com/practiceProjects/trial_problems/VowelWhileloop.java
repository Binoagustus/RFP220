package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class VowelWhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any of the alphabet from a to z");
		char input = sc.next().charAt(0);
		switch(input) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The alphabet is a vowel");
		break;
		default:
			System.out.println("The alphabet is a consonant");
		break;	
		}
	}

}
