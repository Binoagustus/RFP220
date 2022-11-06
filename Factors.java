package com.dayFiveProjects;

import java.util.Scanner;

public class Factors {
	int[] factor = new int[20];
	
	public void primefactors(int num) {
		if(num == 1) {
			System.out.println("1 is neither prime nor composite");
		}
		 for(int i = 2; i <= num; i++) {
	         while(num % i == 0) {
	            System.out.println(i);
	            num = num / i;
	            if(num == i) {
		        	 System.out.println(num);
		         }
	         }
	     }
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number to find prime factors");
		int num = sc.nextInt();
		Factors pf = new Factors();
		pf.primefactors(num);
		sc.close();
	}

}
