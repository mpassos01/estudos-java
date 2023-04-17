import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Preencha a hora inicial do jogo.");
		a = sc.nextInt();
		
		System.out.println("Preencha a hora final do jogo.");
		b = sc.nextInt();
		
		if (a > b) {
			c =24 - a + b;
			System.out.printf("O jogo durou %d horas", c);
		}	
		else if (a == b) {
			System.out.println("Esse jogo durou 24 horas.");
		}
		else {
			c = b - a;
			System.out.printf("O jogo durou %d horas", c);

		}
		
		sc.close();
	}

}
