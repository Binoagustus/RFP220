package com.firstProject.basicPrograms;

import java.util.Scanner;

public class PercentageClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks ");
		float marks = sc.nextInt();
		float percentage_value = (marks*100)/500; //taking total as 500
		System.out.println("Percentage is "+percentage_value);
		if(percentage_value>=75) {
			System.out.println("You have got distinction\nGold Medalist");
		}
		else if(percentage_value>=60 && percentage_value<75) {
			System.out.println("You have got First Class\nSilver Medalist");
		}
		else if(percentage_value>=50 && percentage_value<60) {
			System.out.println("You have got Second Class\nBronze Medalist");
		}
		else {
			System.out.println("Better Luck Next Time");
		}
		sc.close();
	}

}
