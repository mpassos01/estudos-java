import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Informe o primeiro número: ");
		x = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else {
				System.out.println("segundo");
			}
			System.out.println("Informe o primeiro número: ");
			x = sc.nextInt();
			System.out.println("Informe o segundo número: ");
			y = sc.nextInt();
		}
		sc.close();
	}

}
