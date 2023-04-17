import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroPeca1; 
		int codigoPeca2, numeroPeca2;
		double valorUniPeca1,valorUniPeca2 ,total;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUniPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUniPeca2 = sc.nextDouble();
		
		total = numeroPeca1 * valorUniPeca1 + numeroPeca2 * valorUniPeca2;
		
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
