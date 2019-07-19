package co.grandcircus;

import java.util.Scanner;
import java.util.Random;

public class Lab6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		System.out.println("Welcome to the Grand Circus Casino!");
		do {
			System.out.println("How many sides should each die have? ");
			int sides = scan.nextInt();
			scan.nextLine();
			System.out.println("Roll 1: " + generateRandomDieRoll(sides));
			System.out.println("Roll 2: " + generateRandomDieRoll(sides));
			
			System.out.println("Roll again? (y/n): ");
			if (scan.nextLine().equalsIgnoreCase("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
		} while (keepGoing);
	}
	
	public static int generateRandomDieRoll(int sides) {
		Random randy = new Random();
		if(sides != 1) {
			return randy.nextInt(sides) + 1;
		}
		else {
			return 1;
		}
	}
	
}
