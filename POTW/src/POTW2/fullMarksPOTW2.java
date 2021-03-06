package POTW2;

import java.util.Arrays;
import java.util.Scanner;

public class fullMarks {

	public static void main(String[] args) {

		// Creating the scanner class to scan the user's inputs
		Scanner keyboard = new Scanner(System.in);

		// Variable1, which is how many paint drops on the canvas
		int input1 = keyboard.nextInt();

		// 2 different arrays to store the x and y coordinates of the location of each
		// seperate paint drop.
		int xCoordinates[] = new int[input1];
		int yCoordinates[] = new int[input1];

		// Adding coordinates before commma into x coordinates, after comma into y
		// coordinates
		for (int i = 0; i < input1; i++) {
			String input = keyboard.next();
			xCoordinates[i] = Integer.parseInt(input.split(",")[0]);
			yCoordinates[i] = Integer.parseInt(input.split(",")[1]);
		}

		// Sorting the arrays into numerical order
		Arrays.sort(xCoordinates);
		Arrays.sort(yCoordinates);

		// Values
		int xSmall = xCoordinates[0];
		xSmall -= 1;
		int ySmall = yCoordinates[0];
		ySmall -= 1;
		int xBig = xCoordinates[input1 - 1];
		xBig += 1;
		int yBig = yCoordinates[input1 - 1];
		yBig += 1;

		// Outputting the two points for the box!
		System.out.println(xSmall + "," + ySmall + "\n" + xBig + "," + yBig);

	}

}