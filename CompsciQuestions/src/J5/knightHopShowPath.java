package J5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class knightHopShowPath {

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
		
		while(1<2) {
		
		// Initializing
		initialPosition[0][0] = Integer.parseInt(keyboard.next());
		initialPosition[0][1] = Integer.parseInt(keyboard.next());
		desiredPosition[0] = Integer.parseInt(keyboard.next());
		desiredPosition[1] = Integer.parseInt(keyboard.next());

		// Single variables
		int jumpX;
		int jumpY;
		int x = 0;

		if (initialPosition[0][0] == desiredPosition[0] && initialPosition[0][1] == desiredPosition[1]) {
			System.out.println(0);
			System.out.println("Path: initial position is the target.");
			System.exit(0);
		}

		
		// 1st Jump
		for (int i = 0; i < 8; i++) {
			jumpX = initialPosition[0][0] + possibleIncrements[i][0];
			jumpY = initialPosition[0][1] + possibleIncrements[i][1];
			if ((jumpX > 0 && jumpX <= 8) && (jumpY > 0 && jumpY <= 8)) {
				// Jump1
				jump1[x][0] = jumpX;
				jump1[x][1] = jumpY;

				if (jumpX == desiredPosition[0] && jumpY == desiredPosition[1]) {
					System.out.println(1);
					System.out.println("Path: (" + initialPosition[0][0] + "," + initialPosition[0][1] + ")"
							+ " -> (" + jumpX + "," + jumpY + ")");
					System.exit(0);
				}

			} else {
				jump1[x][0] = 0;
				jump1[x][1] = 0;
			}
			x++;
		}

		x=0;
		
		// 2nd Jump
		for (int k = 0; k < 8; k++) {
			
			for (int j = 0; j < 8; j++) {
				if (jump1[k][0] == 0 && jump1[k][1] == 0) {
					x = x+7;
					j = 7;
				}
				jumpX = jump1[k][0] + possibleIncrements[j][0];
				jumpY = jump1[k][1] + possibleIncrements[j][1];
				if ((jumpX > 0 && jumpX <= 8) && (jumpY > 0 && jumpY <= 8)) {
					// Jump2
					jump2[x][0] = jumpX;
					jump2[x][1] = jumpY;

					if (jumpX == desiredPosition[0] && jumpY == desiredPosition[1]) {
						System.out.println(2);
						System.out.println("Path: (" + initialPosition[0][0] + "," + initialPosition[0][1] + ")"
								+ " -> (" + jump1[k][0] + "," + jump1[k][1] + ")"
								+ " -> (" + jumpX + "," + jumpY + ")");
						System.out.println(k);
						System.exit(0);
					}

				} else {
					jump2[x][0] = 0;
					jump2[x][1] = 0;
				}
				x++;
			}
		}

		x = 0;

		// 3rd Jump
		for (int k = 0; k < 64; k++) {
			for (int j = 0; j < 8; j++) {
				if (jump2[k][0] == 0 && jump2[k][1] == 0) {
					x = x+7;
					j = 7;
				}
				jumpX = jump2[k][0] + possibleIncrements[j][0];
				jumpY = jump2[k][1] + possibleIncrements[j][1];
				if ((jumpX > 0 && jumpX <= 8) && (jumpY > 0 && jumpY <= 8)) {
					// Jump2
					jump3[x][0] = jumpX;
					jump3[x][1] = jumpY;

					if (jumpX == desiredPosition[0] && jumpY == desiredPosition[1]) {
						System.out.println(3);
						System.out.println("Path: (" + initialPosition[0][0] + "," + initialPosition[0][1] + ")"
								+ " -> (" + jump1[k / 8][0] + "," + jump1[k / 8][1] + ")"
								+ " -> (" + jump2[k][0] + "," + jump2[k][1]+ ")"
								+ " -> (" + +jumpX + "," + jumpY + ")");
						System.out.println(k);
						System.exit(0);
					}

				} else {
					jump3[x][0] = 0;
					jump3[x][1] = 0;
				}
				x++;
			}
		}

		x = 0;

		// 4th Jump
		for (int k = 0; k < 512; k++) {
			for (int j = 0; j < 8; j++) {
				if (jump3[k][0] == 0 && jump3[k][1] == 0) {
					x = x+7;
					j = 7;
				}
				jumpX = jump3[k][0] + possibleIncrements[j][0];
				jumpY = jump3[k][1] + possibleIncrements[j][1];
				if ((jumpX > 0 && jumpX <= 8) && (jumpY > 0 && jumpY <= 8)) {
					// Jump2
					jump4[x][0] = jumpX;
					jump4[x][1] = jumpY;

					if (jumpX == desiredPosition[0] && jumpY == desiredPosition[1]) {
						System.out.println(4);
						System.out.println("Path: (" + initialPosition[0][0] + "," + initialPosition[0][1] + ")"
								+ " -> (" + jump1[k / 64][0] + "," + jump1[k / 64][1] + ")"
								+ " -> (" + jump2[k / 8][0] + ","	+ jump2[k / 8][1] + ")"
								+ " -> (" + jump3[k][0] + "," + jump3[k][1] + ")"
								+ " -> (" + jumpX + ","+ jumpY + ")");
						System.out.println(k);
						System.exit(0);
					}

				} else {
					jump4[x][0] = 0;
					jump4[x][1] = 0;
				}
				x++;
			}
		}

		x = 0;

		// 5th Jump
		for (int k = 0; k < 4096; k++) {
			for (int j = 0; j < 8; j++) {
				if (jump4[k][0] == 0 && jump4[k][1] == 0) {
					x = x+7;
					j = 7;
					}
				jumpX = jump4[k][0] + possibleIncrements[j][0];
				jumpY = jump4[k][1] + possibleIncrements[j][1];
				if ((jumpX > 0 && jumpX <= 8) && (jumpY > 0 && jumpY <= 8)) {
					// Jump2
					jump5[x][0] = jumpX;
					jump5[x][1] = jumpY;

					if (jumpX == desiredPosition[0] && jumpY == desiredPosition[1]) {
						System.out.println(5);
						System.out.println("Path: (" + initialPosition[0][0] + "," + initialPosition[0][1] + ")"
								+ " -> (" + jump1[k / 512][0] + "," + jump1[k / 512][1] + ")"
								+ " -> (" + jump2[k / 64][0] + "," + jump2[k / 64][1] + ")"
								+ " -> (" + jump3[k / 8][0] + "," + jump3[k / 8][1] + ")"
								+ " -> (" + jump4[k][0] + "," + jump4[k][1] + ")"
								+ " -> (" + jumpX + "," + jumpY + ")");
						System.out.println(k);
						System.exit(0);
					}

				} else {
					jump5[x][0] = 0;
					jump5[x][1] = 0;
				}
				x++;
			}
		}

		x = 0;

		// 6th Jump
		for (int k = 0; k < 32768; k++) 
		{
			for (int j = 0; j < 8; j++) 
			{
				if (jump5[k][0] == 0 && jump5[k][1] == 0) 
				{
					x = x+7;
					j = 7;
				}
				jumpX = jump5[k][0] + possibleIncrements[j][0];
				jumpY = jump5[k][1] + possibleIncrements[j][1];
				if ((jumpX > 0 && jumpX <= 8) && (jumpY > 0 && jumpY <= 8))
				{
					// Jump2
					jump6[x][0] = jumpX;
					jump6[x][1] = jumpY;

					if (jumpX == desiredPosition[0] && jumpY == desiredPosition[1]) 
					{
						System.out.println(6);
						System.out.println("Path: (" + initialPosition[0][0] + "," + initialPosition[0][1] + ")"
								+ " -> (" + jump1[k / 4096][0] + "," + jump1[k / 4096][1] + ")"
								+ " -> (" + jump2[k / 512][0] + "," + jump2[k / 512][1] + ")"
								+ " -> (" + jump3[k / 64][0] + "," + jump3[k / 64][1] + ")"
								+ " -> (" + jump4[k / 8][0] + "," + jump4[k / 8][1] + ")"
								+ " -> (" + jump5[k][0] + "," + jump5 [k][1] + ")"
								+ " -> (" + jumpX + "," + jumpY + ")");
						System.exit(0);
					}

				} else 
				{
					jump6[x][0] = 0;
					jump6[x][1] = 0;
				}
				x++;
			}
		}

		}
	}
}
