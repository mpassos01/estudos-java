import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int entrada, quantidade;
		double total = 0.00;

		System.out.println("Informe o código do item:");
		entrada = sc.nextInt();
		System.out.println("Informe a quantidade:");
		quantidade = sc.nextInt();

		if (entrada == 1) {
			total = quantidade * 4.00;
		} else if (entrada == 2) {
			total = quantidade * 4.50;
		} else if (entrada == 3) {
			total = quantidade * 5.00;
		} else if (entrada == 4) {
			total = quantidade * 2.00;
		} else if (entrada == 5) {
			total = quantidade * 1.50;
		} else {
			System.out.println("Código invalido!");
		}

		System.out.printf("O total é %.2f", total);

		sc.close();
	}
}
