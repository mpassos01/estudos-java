import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		double divisao = 0;
		 N = sc.nextInt();
		 
		 for(int i = 0; i < N; i++) {
			 int x = sc.nextInt();
			 int y = sc.nextInt();
			 
			 if(y != 0) {
				 divisao = (double) x / y;
			 } else {
				 System.out.println("Divisão inpossível!");
			 }
			 System.out.println(divisao);
		 }

		sc.close();

	}

}
