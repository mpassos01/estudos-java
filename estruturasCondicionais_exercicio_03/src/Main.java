import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Informe o primeiro número:");
		a = sc.nextInt();
		System.out.println("Informe o segundo número:");
		b = sc.nextInt();
		
		if (b % a == 0 || a % b == 0) { 
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}