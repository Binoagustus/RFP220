package com.daySixProjects;

import java.util.Scanner;

public class StopWatch {
	
	public void time() {
		Scanner sc=new Scanner(System.in);
		long start,end;
		double time;
		System.out.println("Type any character to start the stopwatch");
		char star = sc.next().charAt(0);
		
		start = System.currentTimeMillis();
		
		System.out.println("Type any character to stop the stopwatch");
		char stop = sc.next().charAt(0);
		
		end = System.currentTimeMillis();
		
		time = (end - start) / 1000.0;
		double hours = (time / 3600) / 1000.0;
		System.out.println("Elapsed time is hours "+hours+" seconds "+time);
		sc.close();
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.time();
	}
}
