package J1;

import java.util.Scanner;

public class SpeedFinesAreNotFine {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int limit = keyboard.nextInt();
		int carSpeed = keyboard.nextInt();
		
		if(carSpeed>limit) {
			if(carSpeed>limit && carSpeed<=limit+20) {
				System.out.println("You are speeding and your fine is $100.");
			} else if (carSpeed>limit+20 && carSpeed <= limit + 30){
				System.out.println("You are speeding and your fine is $270.");
			} else {
				System.out.println("You are speeding and your fine is $500.");
			}
		} else {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		
	}

}