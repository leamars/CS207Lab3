package edu.grinnell.CSC207.GlimmerLabs.BrokenCode;

public class Task2 {
	
	public static int sumUp(int[] array) {

		int sum = 0;

		for (int i = 0; i <= array.length; i++) {
			sum = sum + i;
		}

		return sum;
	} // sumUp(int[] array)

	public static void main (String[] args) {

		// TASK 2 output
		System.out.println("\nTask 2 output:");
		int[] sumThis = {3, 6, 3, 5, 78, 2, 9, 0, 12};

		System.out.println(sumUp(sumThis));

	}
} // main(String[] args)
