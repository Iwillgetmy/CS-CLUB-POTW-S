package POTW1;

import java.util.Scanner;

public class POTW1 {

	public static void main(String[] args) {

		// Variables
		int store;
		int store2;
		int coolNumbers = 0;

		// Creating a scanner object
		Scanner num = new Scanner(System.in);

		// Getting first number
		store = num.nextInt();

		// Getting second number
		store2 = num.nextInt();

		// Figuring out how many "cool" numbers in range
		for (int i = store; i <= store2; i++) {

			int integer = (int) Math.sqrt(i);
			int integer2 = (int) Math.cbrt(i);

			if (Math.sqrt(i) % integer == 0 && Math.cbrt(i) % integer2 == 0) {
				coolNumbers += 1;
			}

		}

		System.out.println(coolNumbers);
		
	}
}