package edu.grinnell.CSC207.GlimmerLabs.BrokenCode;

public class Task7 {
	
	public static int powerOf(int x, int p) {
		// Base case: When p = 0, result is 1
		if (p == 0) {
			return 1;
		}
		// Base case: When p = 1, result is x
		else if (p == 1) {
			return x;
		}
		// Recursive case: When p is odd, result is x*(x^(p-1))
		else if (p % 2 == 0) {
			return powerOf(x*x, p/2);
		}
		// Recursive case: When p is even, result is x^(p^2) square
		else if (p % 2 != 0) {
			return powerOf(x*x, (p-1)/2);
		}
		else 
			return 0;
	} // powerOf(int, int)
	
	public static void main(String[] argv) {

		// TASK 7 output
		System.out.println("\nTask 7 output:");
		System.out.println(powerOf(2, 6));
		System.out.println(powerOf(2, 5));
	}
} // main(String[] argv)
