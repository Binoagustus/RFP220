package com.dayThreeProjects.arrayprojects;

public class FrequencyArray {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,7,8,5,7,9,11,5,7,3};
		int[] freqArray = new int [arr.length];
		for(int i = 0; i < arr.length; i++) {
			int firstValue = arr[i];
			int count = 1;
			for(int j = i + 1; j < arr.length; j++) {
				if(firstValue == arr[j]) {
					count++;
					freqArray[j] = -1;
				}
			} if(freqArray[i] != -1) {
				freqArray[i] = count;
			}
		}

		for(int i = 0; i < freqArray.length; i++) {
			if(freqArray[i] > 1) {
				System.out.print(arr[i]+" is present "+freqArray[i]+" times\n");				
			}
		}

	}

}
