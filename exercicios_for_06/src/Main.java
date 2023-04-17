import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		N = sc.nextInt();

		for (int i = N; i > 0; i--) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}