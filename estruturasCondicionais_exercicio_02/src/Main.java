import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Preencha um número inteiro para verificar se é par ou ímpar.");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Esse número é PAR");
		}	
		else {
			System.out.println("Esse número é ÍMPAR");
		}
		
		sc.close();
	}

}
