package com.dayFiveProjects;

public class SwapNumbers {
	
	public SwapNumbers(int num1,int num2) {
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping "+num1+" "+num2);
	}

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 6;
		System.out.println("Before swapping "+num1+" "+num2);
		SwapNumbers sn = new SwapNumbers(num1, num2);
		
	}

}
