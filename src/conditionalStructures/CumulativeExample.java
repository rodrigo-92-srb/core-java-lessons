package conditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class CumulativeExample {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How much time has been used this month? (in minutes)");
		int minutes = sc.nextInt();
		
		double cost = 50.0;
		
		if(minutes > 100) {
			//cost = cost + (minutes-100) * 2.0;
			cost+= (minutes-100) * 2.0;
		}
		
		System.out.printf("Total Cost= US$ %.2f%n", cost);
		
		sc.close();

	}

}
