package com.dayThreeProjects.arrayprojects;

public class OddEvenArray {
	public static void main(String[] args) {
		
		int array[] = {3,6,2,5,4,8,52,32};
		for(int i =0; i<array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i]+" is even number");
			} else {
				System.out.println(array[i]+" is odd number");
			}
		}
		

	}

}


