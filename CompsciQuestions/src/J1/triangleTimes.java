package J1;
import java.util.Scanner;

public class triangleTimes {

	public static void main(String[] args) {
	
		 Scanner keyboard = new Scanner(System.in);
	        
	        int int1 = keyboard.nextInt();
	        int int2 = keyboard.nextInt();
	        int int3 = keyboard.nextInt();
	        
	        if(int1 == int2 && int2 == int3 && int1 == 60){
	            System.out.println("Equilateral");
	        } else if ((int1 == int2 || int2 == int3 || int3 == int1) && int1+int2+int3 == 180){
	            System.out.println("Isosceles");
	        } else if ((int1 != int2  && int2 != int3) && int1+int2+int3 == 180){
	            System.out.println("Scalene");
	        } else{
	            System.out.println("Error");
	        }
	}

}
