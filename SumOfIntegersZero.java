package com.dayFiveProjects;

import java.util.Scanner;

public class SumOfIntegersZero {
	Scanner sc = new Scanner(System.in);
	int[] triplet = new int[10];
	int count = 0;
	public void findTriplets() {
		for(int i = 0; i < triplet.length; i++) {
			triplet[i] = sc.nextInt();
			
		}
		System.out.println("Distinct Triplets are");
		for(int i = 0; i < triplet.length; i++) {
			for(int j = i+1; j < triplet.length; j++) {
				for(int k = i+2; k < triplet.length; k++) {
					if(triplet[i] + triplet[j] + triplet[k] == 0) {
						count++;
						System.out.print(triplet[i]+"  "+triplet[j]+"  "+triplet[k]+" \n");
					}
				}
			}	
		}
		System.out.println("Number of distinct triplets "+count);
	}	
	
	public static void main(String[] args) {
		SumOfIntegersZero sz = new SumOfIntegersZero();
		System.out.println("Enter array values ");
		sz.findTriplets();
	}

}
