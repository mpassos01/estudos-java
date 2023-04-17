package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
			
		System.out.printf("Amount to be paid in reais = %.2f", converter.calculate(price, dollar));
		sc.close();
		
	}

}
