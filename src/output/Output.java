package output;

import java.util.Locale;

public class Output {

	public static void main(String[] args) {
		// Teaching
		double x = 10.35784;
		String name = "Rodrigo";
		int age = 31;
		double salary = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha US$ %.2f %n", name, age, salary);
		
	}

}
