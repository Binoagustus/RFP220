package com.dayThreeProjects.arrayprojects;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int[] arr1 = new int[65];
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		System.out.println("\nEnter the elements of the array");
		
		for(int i = 0; i < len; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Ascendiing order Array is ");
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j < len; j++) {
				if(arr1[i] > arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\nDescending order array is");
		for(int i = len - 1; i>=0; i--) {
			int descend = arr1[i];
			System.out.print(descend+" ");
		}
	}

}
