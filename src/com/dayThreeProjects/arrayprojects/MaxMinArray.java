package com.dayThreeProjects.arrayprojects;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p_array = new int[10];
		System.out.println("Enter the values of array ");
		for(int i = 0; i<p_array.length; i++) {
			p_array[i] = sc.nextInt();
		}	
		int max = p_array[0];
		int min = p_array[0];
		for(int i = 0; i<p_array.length; i++) {
			if(p_array[i] > max) {
				max = p_array[i];
			} else if (p_array[i] < min) {
				min = p_array[i];
			} 
		} System.out.println("Maximum value is "+max);
		System.out.println("Minimum value is "+min);
	}

}
