package com.dayFiveProjects;

import java.util.Scanner;

public class LeapYear {
	
	public LeapYear(int year) {
		if(year>=1000) {
			if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println("Leap Year");
			} else{
				System.out.println("Not a leap year");
			}	
		} else {
			System.out.println("Enter a year greater than 4 digits");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year ");
		int year = sc.nextInt();
		LeapYear lp  = new LeapYear(year);
		sc.close();
	}
}
