package day01;

import java.util.Scanner;

public class Question_01 {
	/*
    Write a Java program that accepts two integer numbers and checks if they are equal.
EXAMPLE:
  INPUT      : 
first integer number: 1234
second integer number: 4321
  OUTPUT : 
These numbers are different.
*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 numbers: ");
		int a  = scan.nextInt();
		int b = scan.nextInt();
		
		String result = a==b? "They are the same numbers": "They are different numbers";
		System.out.println(result);
		scan.close();
		
	}

}
