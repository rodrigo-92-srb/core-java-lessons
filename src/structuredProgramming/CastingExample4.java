package structuredProgramming;

public class CastingExample4 {

	public static void main(String[] args) {
		/* INCORRECT 
			int a, b;
			double resultado;
			a = 5;
			b = 2;
			resultado = a / b;
			System.out.println(resultado);
		*/
		/* Correct */
		
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;
		System.out.println(resultado);
	}

}
