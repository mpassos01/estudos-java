import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, total;
		total = 0.00;

		System.out.println("Informe o valor do salário:");

		salario = sc.nextDouble();

		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.00 && salario < 3000.00) {
			total = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", total);
		} else if (salario > 2000.00 && salario < 3000.00) {
			total = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", total);
		} else if (salario < 4500.00) {
			total = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;;
			System.out.printf("R$ %.2f", total);
		} else {
			total = (salario - 2000.00) * 0.28;
			System.out.printf("R$ %.2f", total);
		}

		sc.close();
	}

}
