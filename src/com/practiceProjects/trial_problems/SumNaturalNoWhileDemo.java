package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class SumNaturalNoWhileDemo {

	public static void main(String[] args) {
		// Sum of n natural numbers
				int sum = 0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a natural number");
				int natural_no = sc.nextInt();
				System.out.println("Sum of "+natural_no+" natural number is ");
				while(natural_no != 0) {
					sum = sum + natural_no;
					natural_no--;
				}
				System.out.println(sum);
				sc.close();
	}

}
