package edu.grinnell.CSC207.GlimmerLabs.BrokenCode;

public class Task8 {

	public static int underscore(String word) {
		int i = 0;
		int count = 0;
		char[] wordChars = word.toCharArray();
		
		while (i < word.length()) {
			if (word.charAt(i) == '-') {
				wordChars[i] = '_';
				++count;
				i++;
			}
		}
		return count;
	} // underscore(String word)
	
	public static void main(String[] argv) {

		// TASK 8 output
		System.out.println("\nTask 8 output:");
		System.out.println(underscore("the-mole-on-your-back"));
		System.out.println("boo-meh-rang");
	}
} // main(String[] argv)
