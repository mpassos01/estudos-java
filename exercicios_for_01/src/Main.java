import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe um número de 1 até 1000: ");
		numero = sc.nextInt();

		if (numero >= 1 && numero <= 1000) {
			for (int i = 1; i <= numero; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Número invalido!");
		}

		

		sc.close();

	}

}
