import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Informe o combustivel: ");

		entrada = sc.nextInt();

		while (entrada != 4) {
			if (entrada == 1) {
				alcool += 1;
			} else if (entrada == 2) {
				gasolina += 1;
			} else if (entrada == 3) {
				diesel += 1;
			}

			System.out.println("Informe o combustivel: ");
			entrada = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();
	}

}
