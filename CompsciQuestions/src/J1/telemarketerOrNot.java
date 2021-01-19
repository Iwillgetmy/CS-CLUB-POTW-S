package J1;
import java.util.Scanner;

public class telemarketerOrNot {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int a = Integer.parseInt(keyboard.nextLine());
		int b = Integer.parseInt(keyboard.nextLine());
		int c = Integer.parseInt(keyboard.nextLine());
		int d = Integer.parseInt(keyboard.nextLine());
		
		if (((a == 9 || a == 8)
				&& (b == c)
				&& (d == 9 || d == 8))) {
			System.out.println("ignore");
			System.exit(0);
		}

		System.out.println("answer");

	}

}
