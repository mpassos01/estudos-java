package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("TAX: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("Whith percentage to increase salary?");
		employee.porcentagem = sc.nextDouble();
		
		System.out.println(employee.novoNome());
		
		
		sc.close();
	}

}
