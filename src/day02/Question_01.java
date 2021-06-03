package day02;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		/*
         * Write a Java program that asks to user 2 questions
         * 1 = how many tea do you drink in a day?
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cups of tea for each day: ");
		int tea = sc.nextInt();
		System.out.println("Please enter the amount of sugar for each cup");
		float amount = sc.nextFloat();
		float daily = tea*amount;
		float yearly = (float) ((daily*2.7*365)/1000);
		if (yearly ==0) {
			System.out.println("Good Job, less sugar more health");
		}else {
			System.out.println("Your yearly sugar usage is "+ yearly+" kg");
			System.out.println("Your 40 year sugar usage is "+ (40*yearly)+" kg");
		}
		sc.close();
		

	}

}
