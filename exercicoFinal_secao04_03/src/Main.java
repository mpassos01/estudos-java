import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, prod1, prod2, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		prod1 = A * B;
		prod2 = C * D;
		diferenca = prod1 - prod2;
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
