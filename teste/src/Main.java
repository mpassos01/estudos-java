import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double x, y, z, media;

        for (int i=0; i<N; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            media = (2*x+3*y+5*z)/(2+3+5);

            System.out.printf("%.1f", media);
            }

        sc.close();
    }
}
