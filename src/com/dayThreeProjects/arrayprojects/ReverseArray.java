package com.dayThreeProjects.arrayprojects;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {4,5,1,2,9,8,3};
		System.out.println("Reversed Array is ");
		for(int i = arr.length - 1; i>=0; i--) {
			int reverse = arr[i];
			System.out.print(reverse+" ");
		} 
	}

}
