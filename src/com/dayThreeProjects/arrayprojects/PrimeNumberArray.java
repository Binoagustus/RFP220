package com.dayThreeProjects.arrayprojects;

import java.util.Scanner;

public class PrimeNumberArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for array");
		int[] p_array = new int[5];
		for(int i = 0; i<p_array.length; i++) {
			p_array[i] = sc.nextInt();
		}
//		System.out.println("Elements of array are ");
//		for(int i = 0; i<p_array.length; i++) {
//			System.out.print(p_array[i]+ " ");
//		}
		
		for(int i = 0; i<p_array.length; i++) {
			for(int j=2;j <p_array[i] / 2; j++) {
				if(p_array[i] % j == 0) {
					int not_prime = p_array[i];
					System.out.print(not_prime+" "+"is not prime\n");
					if(p_array[i] % j != 0) {
						int prime = p_array[i];
						System.out.print(prime+" "+"is prime\n");
					}
				}
			} 
		} //System.out.println("is not prime");
//		for(int i = 0; i<p_array.length; i++) {
//			for(int j=2;j <p_array[i] / 2; j++) {
//				if(p_array[i] % j != 0) {
//					int prime = p_array[i];
//					System.out.print(prime+" ");
//				}
//			} 
//		}
	}
}
	
	



