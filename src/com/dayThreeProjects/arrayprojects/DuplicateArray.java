package com.dayThreeProjects.arrayprojects;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] p_array = {1,3,4,7,5,6,7,8,7,9,5,11,5,3};
		for(int i = 0; i < p_array.length; i++) {
			for(int j = i+1; j < p_array.length; j++) {
				if(p_array[i] == p_array[j]) {
					int duplicate = p_array[j];
					System.out.print(duplicate+" ");
				} 
			} 
		}
	}	
}

