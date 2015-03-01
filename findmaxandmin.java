/**
 * 
 */
package findmaxandmin;

import java.util.Random;

/*
 * The program was created to find the largest and smallest number in an array
 */

public class findmaxandmin {

	public static void main(String[] args) {
		
		int[] anarray;
		int index, size;
		
		Random random_number = new Random();
		Random random_length = new Random();
		
		size = random_length.nextInt(10) + 1; // at least one element array
		anarray = new int[size]; // random size
		
		
		// To print the index and value of the array
		for(index = 0; index < anarray.length ; index++) {
			anarray[index] = random_number.nextInt(100);
			System.out.println("Index " + index + " Value " + anarray[index]);
		}
		
		int largest_value = anarray[0];
		int smallest_value = anarray[0];
		
		//Loop to find the largest and smallest number
		for (index = 0; index < anarray.length; index++) {
			
			// condition to find the largest number
			if (largest_value < anarray[index]) {
				largest_value = anarray[index];
			}
			
			// condition to find the smallest number
			if (smallest_value > anarray[index]) {
				smallest_value = anarray[index];
			}
			
		}
 		
		System.out.println();
		System.out.println("The biggest value is " + largest_value);
		System.out.println("The samllest value is " + smallest_value);
		
		
	}

}
