package day03;

public class AverageValueofArray {

	public static void main(String[] args) {
		/* write a java program that calculates the 
		 * average value of array elements
        *
        * input[]= {1,2,3,4,5,6,7}
        * Output : 4
		*/
		int input[]= {1,2,3,4,5,6,7};
		int sum = 0;
		for (int i=0; i<input.length; i++) {
			sum =sum + input[i];
			
		}
		double av = sum/input.length;
		System.out.println(av);
	}

}
