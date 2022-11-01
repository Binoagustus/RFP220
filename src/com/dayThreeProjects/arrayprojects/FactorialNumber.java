package com.dayThreeProjects.arrayprojects;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is ");
		for(fact=1; num != 0; num--) {
			fact = fact * num;			
		}
		System.out.println(fact);
	}

}
