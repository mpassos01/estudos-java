import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		double x, y, z, mediaPonderada;

		System.out.println("Informe a quantidade de testes: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			//System.out.println("Informe os valores:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			mediaPonderada = (2*x+3*y+5*z)/(2+3+5);
			System.out.printf("%.1f%n", mediaPonderada);
		}

		sc.close();

	}

}
