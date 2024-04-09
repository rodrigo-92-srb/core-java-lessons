package conditionalStructures;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		System.out.println("What's the time?");
		hour = sc.nextInt();
		if(hour<=12) {
			System.out.println("Good Morning!");
		}else if (hour>12 && hour<=17){
			System.out.println("Good Afternoon!");
		}
		else {
			System.out.println("Good Evening!");		
		}
		
		sc.close();
	}
}
