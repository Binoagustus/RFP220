package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month in number ");
        int month = sc.nextInt();
        System.out.println("\nEnter the day of the month ");
        int day = sc.nextInt();
        boolean spring = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >=  1 && day <= 30) || (month == 5 && day >=  1 && day <= 31) || (month == 6 && day >=  1 && day <= 20);
        if(spring) {
        	System.out.println(spring);
        } else {
        	System.out.println(spring);
        }

	}

}
