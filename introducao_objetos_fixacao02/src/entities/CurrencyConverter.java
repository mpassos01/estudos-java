package entities;

public class CurrencyConverter {
	public static int TAX = 6;

	public double calculate(double dollarPrice, double amount) {
		double total = dollarPrice * amount;		
		total = total + 0.01 * TAX * total;
		return total;
	}
	
}
