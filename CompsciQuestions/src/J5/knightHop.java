package J5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class knightHop {

	public static void main(String[] args) {

		// Scanner
		Scanner keyboard = new Scanner(System.in);

		// Arrays
		int[][] initialPosition = new int[1][2];
		int desiredPosition[] = new int[2];
		int jump1[][] = new int[8][2];
		int jump2[][] = new int[64][2];
		int jump3[][] = new int[512][2];
		int jump4[][] = new int[4096][2];
		int jump5[][] = new int[32768][2];
		int jump6[][] = new int[262144][2];
		int[][] possibleIncrements = { { 2, 1 }, { 1, 2 }, { -2, -1 }, { -1, -2 }, { 1, -2 }, { -1, 2 }, { 2, -1 },
				{ -2, 1 } };

		// Initializing
		initialPosition[0][0] = Integer.parseInt(keyboard.next());
		initialPosition[0][1] = Integer.parseInt(keyboard.next());
		desiredPosition[0] = Integer.parseInt(keyboard.next());
		desiredPosition[1] = Integer.parseInt(keyboard.next());

		// Single variables
		int jumpX;
		int jumpY;
		int x = 0;

		// ArrayList
		List<int[][]> jumps = new ArrayList<int[][]>();
		jumps.add(initialPosition);
		jumps.add(jump1);
		jumps.add(jump2);
		jumps.add(jump3);
		jumps.add(jump4);
		jumps.add(jump5);
		jumps.add(jump6);

		if (initialPosition[0][0] == desiredPosition[0] && initialPosition[0][1] == desiredPosition[1]) {
			System.out.println(0);
			System.exit(0);
		}

		// forLoop sequence
		for (int i = 0; i < 7; i++) {
			x=0;
			for (int k = 0; k < jumps.get(i).length; k++) {
				for (int j = 0; j < 8; j++) {
					if (jumps.get(i)[k][0] == 0 && jumps.get(i)[k][1] == 0) {
						x = x + 7;
						j = 7;
					}
					jumpX = jumps.get(i)[k][0] + possibleIncrements[j][0];
					jumpY = jumps.get(i)[k][1] + possibleIncrements[j][1];
					if ((jumpX > 0 && jumpX <= 8) && (jumpY > 0 && jumpY <= 8)) {
						// Jump2
						jumps.get(i+1)[x][0] = jumpX;
						jumps.get(i+1)[x][1] = jumpY;

						if (jumpX == desiredPosition[0] && jumpY == desiredPosition[1]) {
							System.out.println(i+1);
							System.exit(0);
						}

					} else {
						jumps.get(i+1)[x][0] = 0;
						jumps.get(i+1)[x][1] = 0;
					}
					x++;
				}
			}
		}
	}
}