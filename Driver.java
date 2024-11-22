/**
 * @description This program accepts an input from the user and then generates a "wild card" output
 * 		that is based on the user input.
 * 
 * @inputs: This program only requires the user to input an integer and will use that to generate
 * 		the wild card.
 * 
 * @outputs This program will output a series of *s and !s based on the integer entered by the user.
 * 		for example if the user enters 5, the output will be: *****!!!!!
 * 
 * @author Erik Jackson
 * @contact erik.jackson@my.century.edu
 * @since 11/03/2024
 * 
 * Institution: Century College
 * Instructor: Mathew Nyamagwa
 * 
 */

import java.util.Scanner;
public class Driver {

	/*  printWildCards function accepts inputs for num, counter, and output and will 
	 * 	run a total of num times. Every recursion will add a "*" to the beginning and a 
	 * 	"!" to the end of output. When counter equals num, the output will print to the console.
	 *  	printWildCard inputs:
	 * 			int num => 			The number of times the recursive function will run.
	 * 			int counter => 		Keeps track of the number of times the recursive function 
	 * 								has run.
	 * 			String output => 	Is the string that will be modified until all of the 
	 * 								recursions are completed. Starts as "".
	 * */
	public static void printWildCards(int num, int counter, String output) {
		// If statement runs if the counter is less than num
		if(counter < num) {
			// counter variable is incremented.
			counter++;
			// output has "*" added to the beginning and "!" added to the end.
			output ="*" + output + "!";
			// printWildCards calls itself with updated versions of the variables.
			printWildCards(num, counter, output);
		} else {
			/*
			 * the else statement will only run when the program has iterated the specified
			 * number of times. It will then print out the final version of output.
			 */
			System.out.println(output);
		}
	}
	
	public static void main(String[] args) {
		int n;
		// initializes the "out" String (aka output in printWildCards()) as "".
		String out = "";
		// User will input an integer for generating the wild card.
		Scanner input = new Scanner(System.in);
		
		//Provides the user with instructions
		System.out.println("This program will take an integer input from the user and output a new wildcard!");
		System.out.println("Please enter a positive integer:");
		try {
			// Takes user int input.
			n = input.nextInt();
			//Makes sure that the integer is positive
			if (n < 0) {
				throw new Exception("Error: The integer must be positive!");
			} else {
				/*
				 * Calls the printWildCards() function with n for the number of times it will
				 * run, 0 to initialize the counter variable in printWildCards(), and the empty
				 * String out to initialize the output variable in printWildCards().
				 */
				printWildCards(n, 0, out);
			}
		// Displays exception message
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}