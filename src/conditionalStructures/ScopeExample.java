package conditionalStructures;

public class ScopeExample {

	public static void main(String[] args) {
		double price = 400.00;
		double discount = 0; // need declare discount out of if condition and initialize with 0, because condition can be false
		if(price < 200.00) {
			discount = price * 0.1;
		}
		System.out.println(discount);
	}
}
