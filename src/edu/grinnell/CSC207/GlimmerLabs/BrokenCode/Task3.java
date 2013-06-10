package edu.grinnell.CSC207.GlimmerLabs.BrokenCode;

public class Task3 {
	
	public static String removeAs(String word) {

		String as = "";
		for (int i = 0; i <= word.length(); i++) {
			if (word.charAt(i) != 'a') {
				as = as + word.charAt(i);
			}
		}

		return as;
	} // removeAs(String word)

	public static void main(String[] args) {

		// TASK 3 output
		System.out.println("\nTask 3 output:");
		System.out.println(removeAs("Banana"));

	}
} // main(String[] args)
