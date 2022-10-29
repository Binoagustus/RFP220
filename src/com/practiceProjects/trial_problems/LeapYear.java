package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year ");
		int year = sc.nextInt();
		if(year>=1852) {
			if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println("Leap Year");
			} else{
				System.out.println("Not a leap year");
			}	
		} else {
			System.out.println("Enter year above 1852");
		}
		sc.close();
	}

}
