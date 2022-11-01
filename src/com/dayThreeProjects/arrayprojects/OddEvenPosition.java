package com.dayThreeProjects.arrayprojects;

public class OddEvenPosition {

	public static void main(String[] args) {
		int[] arr = {4,5,6,3,2,8,9,7,11,16,13};
		System.out.println("Even position ");
		for(int i = 0; i<arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arr[i]);
			}
		} System.out.println("Odd position ");
		for(int i = 0; i<arr.length; i++) {
			if(i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
