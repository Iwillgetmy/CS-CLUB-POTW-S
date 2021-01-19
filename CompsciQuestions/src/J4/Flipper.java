package J4;

import java.util.Scanner;

public class Flipper {

	public static void main(String[] args) {
		
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int tempStore;
		
		//Input
		String input = keyboard.nextLine();
		
		//Array to store characters
		char characters[] = new char[input.length()];
		
		//getting each char
		for(int i = 0; i<input.length(); i++) {
			characters[i] = input.charAt(i);
		}
		
		//Iterating through and doing task
		for(char character: characters) {
			if(character == 'H') {
				 tempStore = a;
				 a = c;
				 c = tempStore;
				 tempStore = b;
				 b = d;
				 d = tempStore;
			} else {
				tempStore = a;
				a = b;
				b = tempStore;
				tempStore = c;
				c = d;
				d = tempStore;
			}
		}
		System.out.println(a + " " + b + "\n" + c + " " + d);
	}
}