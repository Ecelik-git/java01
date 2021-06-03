package day03;


public class MaxandMinValueofArray {
	/* write a method that accepts an integer array 
	 * as input and prints the minimum
         * and the maximum numbers from given array
         *
         *
         * Input : {3,2,5,4,1,6}
         * Output : min: 1 max : 6
         */

	public static void main(String[] args) {
		
		int input []= {3,2,5,4,1,6};
		maxMinArray(input);

	}
	public static void maxMinArray(int[] input) {
		
		int max = input[0], min=input[0];
		
		for(int i=0; i<input.length; i++) {
			if(input[i]>max) {
				max = input[i];
				continue;
			}
			if(input[i]<min) {
				min = input[i];
			}
		
		}
		System.out.println("Maximum Value: " +max);
		System.out.println("Minimum Value: " +min);
	}
}
