package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringToCharArray {

	public static void main(String[] args) {
		/* create a custom return type method accepts a name as parameter
		        * and prints the name as a char array
		        *
		        * (do not use toCharArray() method)
		        *
		        * Input : John
		        * Output : [J, o, h, n]
		*/
		String a = "John";
		charArray(a);
		charArray();
	}
	public static void charArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = scan.next();
		String a []= str.split("");
		System.out.println(Arrays.toString(a));
		scan.close();
	}
	private static void charArray(String input) {
		char output[]= new char[input.length()];
		for(int i = 0; i<input.length(); i++) {
			output[i]=input.charAt(i);
		}
		System.out.println(Arrays.toString(output));
	}

}
