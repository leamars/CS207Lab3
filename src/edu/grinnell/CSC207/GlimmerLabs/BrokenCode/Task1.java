package edu.grinnell.CSC207.GlimmerLabs.BrokenCode;

public class Task1 {

	public static void oddPrint(String[] printWriter) {

		int x = 0;

		for (int i = 0; i < printWriter.length; i++) {
			if (x++ % 2 != 0) {
				System.out.println(printWriter[i]);
			}
		}
	} //oddPrint (String[] array)

	public static void main(String[] args) {

		// TASK 1 output:
		System.out.println("Task 1 output:");
		String[] numbers = {"zero", "one", "two", "three", "four", "five"
				, "six"};
		oddPrint(numbers);
		System.out.println("makeing chane");

	}
} // main(String[] args)
