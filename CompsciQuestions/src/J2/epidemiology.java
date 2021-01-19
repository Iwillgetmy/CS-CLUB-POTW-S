package J2;
import java.util.Scanner;

import javax.swing.JFrame;

public class epidemiology {

	public static void main(String[] args) {
	
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		int p = keyboard.nextInt();
		int n = keyboard.nextInt();
		int r = keyboard.nextInt();
		int totalInfected = n;
		int whatDay = 0;
		int infectedYesterday = n;
		
		while(totalInfected <= p) {
			whatDay+=1;
			totalInfected += infectedYesterday * r;
			infectedYesterday = infectedYesterday * r;
		}
		System.out.println(whatDay);
		
	}
	
}
