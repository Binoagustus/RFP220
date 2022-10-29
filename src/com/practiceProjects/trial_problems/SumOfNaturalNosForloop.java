package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class SumOfNaturalNosForloop {

	public static void main(String[] args) {
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number");
		int natural_no = sc.nextInt();
		System.out.println("Sum of "+natural_no+" natural number is ");
		for(sum=0; natural_no != 0; natural_no--) {
			sum = sum + natural_no;			
		}
		System.out.println(sum);

	}

}
