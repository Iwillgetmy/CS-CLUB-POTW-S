package J2;

import java.util.Scanner;

public class SoundsFishy {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		int d = keyboard.nextInt();

		if (a < b && b < c && c < d) {
			System.out.println("Fish Rising");
		} else if (a > b && b > c && c > d) {
			System.out.println("Fish Diving");
		} else if (a == b && b == c && c == d) {
			System.out.println("Fish At Constant Depth");
		} else {
			System.out.println("No Fish");
		}
	}
}
