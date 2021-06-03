package day01;

import java.util.Scanner;

public class Question_04 {
	/*
    Ask user to enter two numbers
    Show them a menu of operation signs and ask them to choose one.
    "Addition: 1 , Subtraction : 2 , Multiplication : 3, Division : 4
    Print the result on the console
    
    EXAMPLE:
       INPUT:    Num1 : 50
                 Num2 : 5
Which operation do you prefer?
1 for Addition
2 for Subtraction
3 for Multiplication
4 for Division
select 1
Result= 55
    */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 numbers: ");
		
		double a  = scan.nextDouble();
		double b  = scan.nextDouble();
		
		System.out.println("Which operation do you prefer?\n"+
				"1 for Addition\n"+
				"2 for Subtraction\n"+
				"3 for Multiplication\n"+
				"4 for Division");
		
		int s = scan.nextInt();
		
		if(s==1) {
			System.out.println(a+b);
		}else if(s==2) {
			System.out.println(a-b);
		}else if(s==3) {
			System.out.println(a*b);
		}else if(s==4) {
			System.out.println(a/b);
		}else {
			System.out.println("Please enter valid operator");
		}
		scan.close();

	}

}
