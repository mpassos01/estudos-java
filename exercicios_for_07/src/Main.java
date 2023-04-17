import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, quadrado, cubo;
		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			quadrado = i * i;
			cubo = i * i * i;

			System.out.printf("%d %d %d%n", i, quadrado, cubo);

		}

		sc.close();
	}
}