package com.promineotech;

import java.util.Arrays;

public class Week4CodingAssignment {

	public static void main(String[] args) {

		/*
		 * 1a. Create an array of int called ages 
		 * that contains the following 
		 * values: 3, 9, 23, 64, 2, 8, 28, 93. 
		 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println("The value of the first element in the ages array = " + ages[0]);
		
		// What is the length of the ages array?
		System.out.println("The length of the ages array = " + ages.length);
		
		// How do we find the index of the last element?
		//System.out.println(ages.length - 1);
		
		//System.out.println("The last element in the ages array = " + ages[ages.length - 1]);
		
		// How would we print every element of the ages array?
		
		/*
		 * b. Create a new array of int called ages2 
		 * with 9 elements (ages2 will be longer than the ages array, 
		 * and have more elements).  
		 */
		
		int[] ages2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		int sum = 0;
		System.out.println("Before the for loop sum = " + sum);
		// Create a loop to calculate the sum of all the ages in the ages array
		for(int i = 0; i < ages.length; i++) {
			
			sum += ages[i];
//			System.out.println(i);
			System.out.println(sum);
			
		}
		System.out.println(Arrays.toString(ages));
		
		// Create a loop to calculate the sum of all the ages2 in the ages2 array
		
		//System.out.println("Outside of for loop!");
			

		

	}

	// comments show up in grey

}
