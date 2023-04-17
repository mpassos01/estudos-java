import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		int fatorial = 1;
		
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			
			if(N != 0) {
				fatorial = fatorial * i;
			} else {
				System.out.println(1);
			}
			
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}

}
