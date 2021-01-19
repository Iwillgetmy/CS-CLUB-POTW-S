package J5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class EscapeRoom {

	public static void main(String[] args) throws IOException {

		// Scanner
		Reader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);

		// Variables
		int mValue = Integer.parseInt(br.readLine());
		int nValue = Integer.parseInt(br.readLine());
		int x = 0;
		int numbersInRoom[] = new int[mValue * nValue];
		int numberValue[] = new int[mValue * nValue];
		String[] store;
		List<Integer> jumpedTo = new ArrayList<Integer>();
		List<Integer> possibleJumps = new ArrayList<Integer>();

		
	
		// Putting values in numbersInRows
		for (int i = 0; i < mValue; i++) {
			store = br.readLine().split(" ");
			for (int j = 0; j < nValue; j++) {
				numbersInRoom[i * nValue + j] = Integer.parseInt(store[x]);
				numberValue[i * nValue + j] = (i + 1) * (j + 1);
				x++;
			}
			x=0;
		}
		
		jumpedTo.add(numbersInRoom[0]);

		for (int k = 0; k < mValue * nValue; k++) {
			for (int i = 0; i < jumpedTo.size(); i++) {
				for (int j = 0; j < numbersInRoom.length; j++) {
					if (jumpedTo.get(i) == numberValue[j] && numberValue[j] > 0) {
						possibleJumps.add(numbersInRoom[j]);
						if (numberValue[j] == mValue * nValue
								&& numbersInRoom[j] == numbersInRoom[mValue * nValue - 1]) {
							System.out.println("yes");
							System.exit(0);
						}
						numbersInRoom[j] = 0;
						numberValue[j] = 0;
					}
				}
			}
			jumpedTo.clear();
			jumpedTo.addAll(possibleJumps);
			possibleJumps.clear();
		}
		System.out.println("no");
	}
}