package com.daySixProjects;

import java.util.Scanner;

public class Fibonacci {
	int sum = 0;
	int next = 0;
	
	public void calc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms ");
		int terms = sc.nextInt();
		System.out.print("Enter 1st term ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd term ");
		int num2 = sc.nextInt();
		System.out.println();
		for(int i = 1; i < terms; i++) {
			next = num1 + num2;
			num1 = num2;
			num2 = next;
		}
		System.out.println("Fibonacci value is "+next);
		sc.close();
	}
	
	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		fb.calc();
	}

}
