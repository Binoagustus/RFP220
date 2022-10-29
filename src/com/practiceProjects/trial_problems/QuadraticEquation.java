package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three inputs for a, b and c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = b*b - 4*a*c;
		System.out.printf("Delta is %2f\n",delta);
		double root_x1 = (-b + Math.sqrt(delta))/(2*a);
		double root_x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.printf("Root 1 value is %2f\nRoot 2 value is %2f", root_x1,root_x2);
	}
}
