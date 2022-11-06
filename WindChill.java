package com.dayFiveProjects;

import java.util.Scanner;

public class WindChill {
	
	public WindChill(double temp, double velocity) {
		if((temp <= 50) && (velocity >= 3) && (velocity <= 120)) {
			double windchill = 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * Math.pow(velocity, 0.16);
			System.out.println("Effective temperature is "+windchill);
		} else if(((temp >= 50) && (velocity >= 3) && (velocity <= 120))) {
			System.out.println("Enter temperature  below 50 degree");
		} else if(((temp <= 50) && (velocity <= 3) && (velocity >= 120))) {
			System.out.println("Enter velocity ranging between 3 to 120");
		} else if(((temp >= 50) && (velocity <= 3) || (velocity >= 120))) {
			System.out.println("Check both inputs");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature not exceeeding 50 degrees ");
		double temp = sc.nextDouble();
		System.out.println("Enter the velocity ranging from 3 to 120 miles per hour ");
		double velocity = sc.nextDouble();
		WindChill wc = new WindChill(temp, velocity);
	}

}
