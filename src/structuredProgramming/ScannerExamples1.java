package structuredProgramming;

import java.util.Scanner;

public class ScannerExamples1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Insert String:");
		x = sc.next();
		System.out.println("Data input was: "+x);
		double y;
		System.out.println("Insert Double:");
		y=sc.nextDouble();
		System.out.println("Data input was: "+y);
		int z;
		System.out.println("Insert Integer:");
		z=sc.nextInt();
		System.out.println("Data input was: "+z);
		System.out.println("Insert char:");
		char k;
		k = sc.next().charAt(0);
		System.out.println("Data input was in position 0: "+k);
		sc.close();
	}
}
