package J3;

	import java.util.Scanner;
	
	public class IconScaling {
	
		public static void main(String[] args) {
	
			Scanner keyboard = new Scanner(System.in);
	
			int k = keyboard.nextInt();
			char[][] characters = { { '*', 'x', '*' }, { ' ', 'x', 'x' }, { '*', ' ', '*' } };
			for (int a = 0; a < 3; a++) {
				for (int i = 0; i < k; i++) {
					for (int j = 0; j < 3; j++) {
						for (int r = 0; r < k; r++) {
							System.out.print(characters[a][j]);
						}
					}
					System.out.println();
				}
			}
		}
	}
