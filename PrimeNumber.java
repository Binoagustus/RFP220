package com.daySixProjects;

import java.util.Scanner;

public class PrimeNumber {
	int count = 1;
	
	public PrimeNumber(int prime) {
		if(prime == 1) {
			System.out.println("1 is neither prime nor composite number");
		} else if(prime == 2) {
			System.out.println("2 is only even prime number");
		}
		for(int i = 2; i <= prime; i++) {
			while(prime % i == 0) {
				count++;
				break;
			}
		}
		if(count == 2) {
			System.out.println(prime+" is a prime number");
		} else {
			System.out.println(prime+" is not a prime number");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a value ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PrimeNumber pm = new PrimeNumber(num);
		sc.close();
	}

}
