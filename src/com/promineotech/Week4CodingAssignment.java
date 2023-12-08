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
		// Use a loop to iterate through the array 
		// and calculate the average age. Print the result to the console.
		
		for(int i = 0; i < ages.length; i++) {
			
			sum += ages[i];
//			System.out.println(i);
			//System.out.println(sum);
			
		}
		//System.out.println(sum/ages.length);
		
		//System.out.println(Arrays.toString(ages));
		
		/*
		 * 2. Create an array of String called names 
		 * that contains the following values: 
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * 
		 * a. Use a loop to iterate through the array 
		 * and calculate the average number of letters per name. 
		 * Print the result to the console.
		 * 
		 * b. Use a loop to iterate through the array 
		 * again and concatenate all the names together, 
		 * separated by spaces, and print the result to the console.
		 */
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		
		int sum2 = 0;
		
		for(int i = 0; i < names.length; i++) {
			
//			System.out.println(names[i]);
//			System.out.println(names[i].length());
			
			sum2 += names[i].length();
			// System.out.println(names[i].length());
			
		}
		
		System.out.println("Value of sum for names " + sum2);
		System.out.println("Average letters per name in names array =  " + (sum2/names.length));
		
		String concatNames = "";
		for(int i = 0; i < names.length; i++) {
			concatNames += names[i] + " ";
			System.out.println(concatNames);
		}
		
		// Test concatStrings method:
		System.out.println(concatNames("Santa", "Claus"));
		
	} // end of main method
	
	// Create a method that takes 2 Strings and concatenates them together
	
	public static String concatNames(String firstName, String lastName) {
		
		return firstName + " " + lastName;
		
	}
	

} // end of class
