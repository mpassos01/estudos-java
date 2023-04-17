package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.nome = sc.nextLine();

		student.primeiro = sc.nextDouble();

		while (student.primeiro > 30) {
			System.out.println("VALOR INCORRETO! INFORME O DADO NOVAMENTE!");
			student.primeiro = sc.nextDouble();
		}

		student.segundo = sc.nextDouble();
		student.terceiro = sc.nextDouble();
		
		while (student.segundo > 35 || student.terceiro > 35) {
			System.out.println("VALOR INCORRETO! INFORME UM VALOR INFERIOR A 35!");
			student.segundo = sc.nextDouble();
			student.terceiro = sc.nextDouble();
		}

		sc.close();

		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missing());
		} else {
			System.out.println("PASS");
		}

	}

}
