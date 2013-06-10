package edu.grinnell.CSC207.GlimmerLabs.BrokenCode;

public class Task6 {

	public static int convertToFahrenheit(int temp) {
		return (temp - 32) * (5 / 9);
	} // convertToFahrenheit(int temp)

	public static void main(String[] args) {

		// TASK 6 output
		System.out.println("\nTask 6 output:");
		System.out.println("Celsius to Fahrenheit: " + convertToFahrenheit(100));	
	}
} // main(String[] args)