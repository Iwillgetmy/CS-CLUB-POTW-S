package Other;

import java.util.Scanner;

public class soldierAndBananas {

	public static void main(String[] args) {
	
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		int priceFirstBanana = Integer.parseInt(keyboard.next());
		int amountOfCash = Integer.parseInt(keyboard.next());
		int amountBananaWant = Integer.parseInt(keyboard.next());
		int newPrice = priceFirstBanana;
		int totalCashNeeded = 0;
		
		//Getting the total amount needed
		for(int i = 1; i<=amountBananaWant; i++) {
			totalCashNeeded+=newPrice;
			newPrice+=priceFirstBanana * 1;
		}
		
		System.out.println(totalCashNeeded-amountOfCash);
		
		}
	}	