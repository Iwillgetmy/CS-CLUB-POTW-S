package POTW1;

import java.util.Scanner;

public class POTW1MoreEfficient {

	public static void main(String[] args) {

		// Variables
		int min;
		int max;
		int minRoot;
		int maxRoot;
		int coolNumbers = 0;

		// Creating a scanner object
		Scanner num = new Scanner(System.in);

		// Getting first number
		min = num.nextInt();

		// 6th root of minimum number
		minRoot = (int) Math.sqrt(Math.cbrt(min));
 		
		// Getting second number
		max = num.nextInt();

		// 6th root of maximum number
		maxRoot = (int) Math.sqrt(Math.cbrt(max));

		// Iterating through the 6th root of min and max of range
		for (int i = minRoot; i <= maxRoot; i++) {

			// Checking if number to power of 6 is in range
			if (Math.pow(i, 6) >= min && Math.pow(i, 6) <= max) {
				coolNumbers++;
			}

		}

		System.out.println(coolNumbers);
	}

}