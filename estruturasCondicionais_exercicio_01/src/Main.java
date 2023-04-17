import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inteiro;
		
		System.out.println("Preencha um número inteiro para verificar se é negativo.");
		inteiro = sc.nextInt();
		
		if (inteiro < 0) {
			System.out.println("Esse número é negativo");
		}	
		else {
			System.out.println("Esse número é positivo");
		}
		
		sc.close();
	}

}
