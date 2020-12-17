package POTW5;

import java.util.Scanner;

public class POTW5 {
	
	public static void main(String[] args) {

		// Creating scanner
		Scanner keyboard = new Scanner(System.in);

		// Getting user input
		String input = keyboard.nextLine();

		// Variables
		int biggestPalindrome = 1;
		int x = 0;
		StringBuffer reversed = new StringBuffer();
		String possiblePalindrome;
		String placeHolder;
		int l = 1;
		int j = input.length();
		
		// For loop
		for (int i = input.length(); i > 0; i--) {
			
			
			possiblePalindrome = input.substring(x, input.length()); //Setting possiblePalindrome from integer i to the end
			x++; //Making it so that x will increase(the second index will start the second time).
			while(j > 1) { //Using a while loop because I change value of while loop outside 
				j--;//Making j go down one value each time the while loop runs in order to go through every possibility
				possiblePalindrome = possiblePalindrome.substring(0, j + 1); //Creating a substring of the original string
				reversed = new StringBuffer(possiblePalindrome); //creating a stringBuffer, which will eventually reverse the string
				placeHolder = reversed.reverse().toString(); //Reversing original string, putting it into a string(a equals method
															 //with string buffer and string won't work)
				
				//Checking to see if it is the biggest palindrome
				if(placeHolder.equals(possiblePalindrome)) { //If the reversed and original values are equal
					if(possiblePalindrome.length() > biggestPalindrome) { //Checking if the length is bigger than other ones found
						biggestPalindrome = possiblePalindrome.length(); //Setting the variable to the new biggest palindrome found
					}
				}
			}
			//This will reset the j counter once every time, since a while loop won't auto-reset it
			j = input.length()-l;
			l++;
		}
		System.out.println(biggestPalindrome); //Outputting results!
	}
	
}