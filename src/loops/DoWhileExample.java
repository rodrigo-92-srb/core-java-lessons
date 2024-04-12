package loops;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 10;
		System.out.printf("DO WHILE EXAMPLE %n");
		System.out.printf("Num: ");
		do {
			System.out.printf("%d ", num);
			num+=1;
		} while (num < 10);
		
		System.out.printf("%n-----------------------------%n");
		
		System.out.printf("WHILE EXAMPLE %n");
		int i=10;
		System.out.printf("I: ");
		while(i < 10) {
			System.out.printf("%d ", i);
			i+=1;
		}
	}
}
