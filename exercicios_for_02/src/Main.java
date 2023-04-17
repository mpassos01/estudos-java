import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		int in = 0;
		int out = 0;

		System.out.println("Informe a quantidade de valores: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			// System.out.println("Informe os valores: ");
			int intervalo = sc.nextInt();

			if (intervalo >= 10 && intervalo <= 20) {
				in++;
			} else {
				out++;
			}

		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
