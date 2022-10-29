package com.firstProject.basicPrograms;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Addition \nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division \nEnter 5 for Modulus ");
		System.out.println("Enter a number for any of arithmetic operations");
		int num = sc.nextInt();
		int result;
		int num1;
		int num2;	
		switch(num) {
		case 1:
			System.out.println("Enter 1st number ");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number ");
			num2 = sc.nextInt();
			result = num1+num2;
			System.out.println("Addition of two numbers is "+result);
		break;	
		case 2:
			System.out.println("Enter 1st number ");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number ");
			num2 = sc.nextInt();
			result = num1-num2;
			System.out.println("Subtraction of two numbers is "+result);
		break;
		case 3:
			System.out.println("Enter 1st number ");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number ");
			num2 = sc.nextInt();
			result = num1*num2;
			System.out.println("Multiplication of two numbers is "+result);
		break;
		case 4:
			System.out.println("Enter 1st number ");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number ");
			num2 = sc.nextInt();
			result = num1/num2;
			System.out.println("Division of two numbers is "+result);
		break;
		case 5:
			System.out.println("Enter 1st number ");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number ");
			num2 = sc.nextInt();
			result = num1%num2;
			System.out.println("Modulus of two numbers is "+result);
		break;
		default:
			System.out.println("Enter a valid input");
		break;	
		}
		sc.close();
	}

}
