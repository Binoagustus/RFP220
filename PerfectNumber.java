package com.daySixProjects;

import java.util.Scanner;

public class PerfectNumber {
	int num;
	int sum = 0;
	int j = 0;
	Scanner sc = new Scanner(System.in);
	public void divisors() {
		System.out.println("Enter a value to find divisors ");
		num = sc.nextInt();
		int[] values = new int[num];
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				System.out.println(i+" ");
					values[j] = i;
					j++;
			}
		}
		
		//print array values not equals to zero
		for(int i = 0; i < num; i++) {
			if(values[i] != 0) {
				System.out.print(values[i]+" ");
			}
		}
		
		//find sum of all elements
		for(int i = 0; i < num; i++) {
			sum = sum + values[i];
		} System.out.println("\nsum is "+sum);
		
		//check if it a perfect  number
		if(sum == num) {
			System.out.println(num+" is a perfect number");
		} else if(sum != num) {
			System.out.println(num+" is not a perfect number");
		}
	}
	
	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber(); 
		pn.divisors();
	}

}
