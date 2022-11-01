package com.dayThreeProjects.arrayprojects;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int sum = 0, test_check1, test_check2, count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		test_check1 = num;
		test_check2 = num;

		while(num != 0) {
			num = num/10;
			count++;
		} System.out.println("Number of digits "+count);

		while(test_check1 > 0) {
			int remainder = test_check1 % 10;
			sum = (int) (sum + (Math.pow(remainder, count)));
			test_check1 = test_check1/10;
		} 
		if(test_check2 == sum) {
			System.out.println(sum+" is an Armstrong Number");
		} else {
			System.out.println(sum+" is not an Armstrong Number");
		}
	}
}
