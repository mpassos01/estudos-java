import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Erro ao usar números decimais

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double entrada;

		System.out.println("Informe o valor:");
		entrada = sc.nextDouble();

		if (entrada >= 0 && entrada <= 25) {
			System.out.println("Intervalo [0, 25]");
		} else if (entrada <= 50) {
			System.out.println("Intervalo (25, 50]");
		} else if (entrada <= 75) {
			System.out.println("Intervalo (50, 75]");
		} else if (entrada <= 100) {
			System.out.println("Intervalo (75, 100]");
		} else {
			System.out.println("Fora do intervalo!");
		}
		sc.close();
	}
}