import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		double valorHora, salario, numeroHorasTrabalhadas;
		
		numeroFuncionario = sc.nextInt();
		numeroHorasTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();
		salario = valorHora * numeroHorasTrabalhadas;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = US %.2f%n", salario);
		
		sc.close();
	}

}
