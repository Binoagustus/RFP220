package com.dayFiveProjects;

import java.util.Scanner;

public class TwoDArray {
	
	public void twodArray() {
		int rows ,cols;
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		cols = sc.nextInt();
		int[][] arr1 = new int[rows][cols];
		System.out.println("Enter "+rows*cols+" values for array ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("2D array is ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j]+" ");	
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Input number of rows and columns ");
		TwoDArray td = new TwoDArray();
		td.twodArray();
	}
}
