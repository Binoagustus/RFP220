package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class DigitName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int units,tens,hundreds,thousands; //units,tens,hundreds,thousands
		units = number%10;
		tens = (number/10)%10;
		hundreds = (number/100)%10;
		thousands = (number/1000)%10; 
		System.out.println(thousands+" Thousands "+hundreds+" Hundreds "+tens+" tens "+units+" units ");
		sc.close();
	}

}
