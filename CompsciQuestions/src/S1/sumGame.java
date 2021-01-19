package S1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumGame {

	public static void main(String[] args) {

		// Scanner
		Scanner keyboard = new Scanner(System.in);

		// Variables
		int numOfDays = Integer.parseInt(keyboard.nextLine());
		int swiftScore[] = new int[numOfDays];
		int semaphore[] = new int[numOfDays];
		int x = 0;
		int y = 0;
		List<Integer> store = new ArrayList<Integer>();
		store.add(0);
		
		for (int i = 0; i < numOfDays; i++) {
			swiftScore[i] = Integer.parseInt(keyboard.next());
		}

		keyboard.nextLine();

		for (int i = 0; i < numOfDays; i++) {
			semaphore[i] = Integer.parseInt(keyboard.next());
		}

		for (int i = 0; i < numOfDays; i++) {
			
			x+=swiftScore[i];
			y+=semaphore[i];
			
			if(x == y) {
				store.add(i+1);
			}
			
		}
		System.out.println(store.get(store.size()-1));
	}

}
