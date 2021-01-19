package Other;

import java.util.Scanner;

public class Classes {

	public static void main(String[] args) {

		// Scanner
		Scanner keyboard = new Scanner(System.in);

		// Variables
		int amountOfLines = keyboard.nextInt();
		String store = keyboard.nextLine();
		int increment;
		int total;
		// Array to store characters
		char characters[][] = new char[amountOfLines][80];

		// Adding in string characters to characters array
		for (int j = 0; j < amountOfLines; j++) {
			store = keyboard.nextLine();
			for (int i = 0; i < store.length(); i++) {
				characters[j][i] = store.charAt(i);
			}
		}

		// Iterating through, finding the sum
		for (char[] row : characters) {
			total = 0;
			increment = 0;
			for (char character : row) {
				if (character == 'O') {
					increment += 1;
					total += increment;
				} else if (character == 'X') {
					increment = 0;
					total += increment;
				}
			}
			System.out.println(total);
		}
	}
}
