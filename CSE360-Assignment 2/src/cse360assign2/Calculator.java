/*
Author: Brian Nguyen

Class ID: 506

Assignment: Assignment 2

Description: The contents showcase a class that mimics the
 			functionalities of a calculator,
			the class contains six methods: 
			one that returns the current integer total,
			one that computes addition,
			one that computes subtraction,
			one that computes multiplication,
			one that computes division,
			and one that returns a history of all computed actions as a string. 
			The class, containing these methods, is public 
			and the class within a package.
			
*/
package cse360assign2;

/**
 * This class returns integer values modified by mathematical operations when 
 * given integer values; the class can also return the mathematical operations 
 * completed by the user.
 * <p>
 * Within the class is an integer value that keeps track of the total after 
 * the mathematical operations are completed; the class also possesses a 
 * string that keeps track of the specific mathematical operations completed.
 * 
 * @author  Brian Nguyen
 */
public class Calculator {

	private int total;
	private String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method returns the current integer total after the mathematical operations
	 * are complete.
	 * <p>
	 * If no mathematical operations are done, this method returns 0.
	 * 
	 * @return	the current integer total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method computes the sum of the given parameter "value" and 
	 * the total integer.
	 * 
	 * @param	value	the value to be added by the total variable.
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * This method subtracts the given parameter "value" from the total integer.
	 * 
	 * @param	value	the value to be subtracted from the total variable.
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * This method computes the product of the given parameter "value" and 
	 * the total integer.
	 * 
	 * @param	value	the value to be multiplied by the total variable.
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * This method divides the total integer by the given parameter
	 * "value".
	 * <p>
	 * If the value is 0, the total is set to zero.
	 * 
	 * @param	value	the value to be divided from the total variable.
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
			history = history + " / " + value;
		}
		else {
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	/**
	 * This method returns a history of all completed actions as a String.
	 * 
	 * @return a String of the history of all completed actions
	 */
	public String getHistory () {
		return history;
	}
}