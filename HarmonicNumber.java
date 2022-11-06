package com.dayFiveProjects;

import java.util.Scanner;

public class HarmonicNumber {
	final float numerator = 1;
	//float harmonicNumber;
	float sum = 0;
	
	public void harmonicValue(int num) {
		for(float i = 1; i <= num; i++) {
			sum = sum + (numerator / i);
		}
		System.out.println("The value of Harmonic Number "+num+" is "+sum);
	}

	public static void main(String[] args) {
		System.out.println("Enter the value for N to find Nth Harmonic Number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		HarmonicNumber hm = new HarmonicNumber();
		hm.harmonicValue(value);
		sc.close();
	}

}
