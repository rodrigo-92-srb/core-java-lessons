package conditionalStructures;

public class TernaryOperatorExample {
	
	public static void main(String[] args) {
	
		double price = 20.0;
		double off;
		off = (price >= 50) ? price*0.1 : price*0.2;
		price-=off;
		System.out.printf("Off: U$%.2f%n", off);
		System.out.printf("Price with off percentage: U$%.2f", price);
	}
}
