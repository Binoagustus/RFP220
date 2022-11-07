package com.daySixProjects;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class StopWatch {

	public void time() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type any character to start the stopwatch");
		char start = sc.next().charAt(0);
		LocalTime obj1 = LocalTime.now();
		System.out.println("Type any character to stop the stopwatch");
		char stop = sc.next().charAt(0);
		LocalTime obj2 = LocalTime.now();
		System.out.print("Hours " + obj1.until(obj2, ChronoUnit.HOURS) + " ");
		System.out.print("Minutes " + obj1.until(obj2, ChronoUnit.MINUTES) + " ");
		System.out.print("Seconds " + obj1.until(obj2, ChronoUnit.SECONDS) + " ");
		sc.close();
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.time();
	}
}
