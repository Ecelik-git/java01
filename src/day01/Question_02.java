package day01;

import java.util.Scanner;

public class Question_02 {
	/*
    Write a program in Java to input 5 numbers from keyboard and find their sum and average.
EXAMPLE:
INPUT      :  
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5              
 OUTPUT : 

The sum of 5 number is : 15
The Average is : 3.0       
*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 numbers: ");
		int a  = scan.nextInt();
		int b  = scan.nextInt();
		int c  = scan.nextInt();
		int d  = scan.nextInt();
		int e  = scan.nextInt();
		
		int sum = a+b+c+d+e;
		double ave = sum/5;
		
		System.out.println("The sum of 5 number is "+sum);
		System.out.println("The average of 5 number is "+ave);
		scan.close();
	}

}
