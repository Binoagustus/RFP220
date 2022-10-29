package com.firstProject.basicPrograms;

import java.util.Scanner;

public class BusReservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the destination name ");
		String destination = sc.nextLine();
		if(destination.equals("banglore")) {
			System.out.println("Bus is reserved for banglore\nSeat is alotted");
		}
		else {
			System.out.println("Bus is not available for the destination");
		}

	}

}
