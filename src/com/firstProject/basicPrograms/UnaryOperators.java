package com.firstProject.basicPrograms;

public class UnaryOperators {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		
		System.out.println(--num2);
		System.out.println(num2);
		System.out.println(num1++);
		System.out.println(num1);  
		
		int num3 = --num2;
		int num4 = num1++;
		System.out.println("prefix of num2 "+num3);
		System.out.println("postfix of num1 "+num4);
		System.out.println("Value of num1 "+num1); 
		
		int num5 = 9;
		int num6 = -9;
		System.out.println(~num5);
		System.out.println(~num6);
		System.out.println(20>>3); //doubt
	}
}
