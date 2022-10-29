package com.practiceProjects.trial_problems;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int result1,result2,result3,result4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three inputs for a, b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		result1 = a+b*c;
		result2 = c+a/b;
		result3 = a%b+c;
		result4 = a*b+c;
		System.out.println("Result1 "+result1+"\nResult2 "+result2+"\nResult3 "+result3+"\nResult4 "+result4);
		int max1 = Math.max(result1, result2);
		int max2 = Math.max(max1, result3);
		int max3 = Math.max(max2, result4);
		int min1 = Math.min(result1, result2);
		int min2 = Math.min(min1, result3);
		int min3 = Math.min(min2, result4);

		System.out.println("Maximum of all values is "+max3+"\nMinimum of all values is "+min3);
	}

}
