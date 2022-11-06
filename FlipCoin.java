package com.dayFiveProjects;

import java.util.Scanner;

public class FlipCoin {
	float tails;
	float heads;
	float percentHeads;
	float percentTails;

	public void headsTails(int flip) {
		for(int i = 0; i < flip; i++) {
			float random =  (float) Math.random();
			if (random < 0.5) {
				tails ++;
			} else if(random > 0.5) {
				heads ++;
			}
		}
		this.percentage();
	}
	
	public void percentage() {
		percentHeads = (heads/10) * 100;
		percentTails = (tails/10) * 100;
		System.out.println("Percentage of heads to tails is "+(int)percentHeads+" : "+(int)percentTails);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of times to flip a coin");
		Scanner sc =  new Scanner(System.in);
		int flips = sc.nextInt();
		FlipCoin fc = new FlipCoin();
		fc.headsTails(flips);
	}

}
