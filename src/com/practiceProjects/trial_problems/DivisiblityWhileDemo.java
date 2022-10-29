package com.practiceProjects.trial_problems;

public class DivisiblityWhileDemo {
	public static void main(String[] args) {
		int i=1;

		while(i<=100) {
			if(i%5 == 0) {
				System.out.println("Divisible values of 5 from 1 to 100 "+i);
			}
			i++;
		}
	}
}
