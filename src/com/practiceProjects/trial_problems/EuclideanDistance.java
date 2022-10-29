package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class EuclideanDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two arguements x and y ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double distance;
		double powerof_x = Math.pow(x, 2);
		double powerof_y = Math.pow(y, 2);
		distance = Math.sqrt(powerof_x + powerof_y);
		System.out.printf("Euclidean Distance is %2f", distance);
	}

}
