package loops;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a value: ");
		int x = sc.nextInt();
		int sum = 0;
		while(x!=0) {
			sum+=x;
			System.out.println("Insert a value: ");
			x = sc.nextInt();
		}
		System.out.println("SUM: "+sum);
		sc.close();
	}

}
