package com.firstProject.basicPrograms;

import java.util.Scanner;

public class Tables_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
	    int table_num = sc.nextInt();
	    sc.close();
		int result;
		for(int i=1; i<=10; i++) {
			result = table_num * i;
			System.out.println(result);
		}

	}

}
