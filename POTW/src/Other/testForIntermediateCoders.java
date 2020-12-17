package Other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntermediateTest {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
	
		//Variables
		int lines = keyboard.nextInt();
		int x;
	
		//An array
		int numberOfTimes[] = new int[lines];
		String symbol[] = new String[lines];
		
		
		for(int i = 0; i<lines; i++) {
		numberOfTimes[i] = keyboard.nextInt();
		symbol[i] = keyboard.next();
		}
		
		x = numberOfTimes[0];
	    		
		for(int i = 0; i<lines; i++) {
			for(int j = 0; j<numberOfTimes[i]; j++) {
				System.out.print(symbol[i]);
			}
			System.out.println();
		}
		
	}
	
}