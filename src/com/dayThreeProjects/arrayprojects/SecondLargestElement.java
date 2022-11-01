package com.dayThreeProjects.arrayprojects;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter the values of array ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i - 1];
			}
		} System.out.println("Maximum value is "+max);	
	}

}
