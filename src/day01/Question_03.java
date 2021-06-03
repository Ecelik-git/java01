package day01;

import java.util.Scanner;

public class Question_03 {
	/*
    Write a Java program to print the sum (addition), multiply, subtract, divide two numbers.
EXAMPLE:
INPUT      : 
first number: 125
second number: 25
OUTPUT:
The sum of two numbers is : 150
The difference of two numbers is : 100
The product of two numbers is : 3125
The division of two numbers is : 5.0
    */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 numbers: ");
		
		double a  = scan.nextDouble();
		double b  = scan.nextDouble();
		
		System.out.println("The sum of 2 numbers is "+(a+b));
		System.out.println("The difference of 2 numbers is "+(a-b));
		System.out.println("The product of 2 numbers is "+(a*b));
		System.out.println("The division of 2 numbers is "+(a/b));
		
		scan.close();

	}

}
