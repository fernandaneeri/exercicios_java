package exercicio_proposto_3_poo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Student stu = new Student();

		System.out.print("Name: ");
		stu.nome = sc.next();

		System.out.print("1ª nota: ");
		stu.n1 = sc.nextDouble();

		System.out.print("2ª nota: ");
		stu.n2 = sc.nextDouble();

		System.out.print("3ª nota: ");
		stu.n3 = sc.nextDouble();

		if (stu.n1 > 30) {
			System.out.println("Nota máxima do primeiro trimestre é 30");
		}

		else if (stu.n2 > 35) {
			System.out.println("Nota máxima do segundo trimestre é 35");
		}

		else if (stu.n3 > 35) {
			System.out.println("Nota máxima do terceiro trimestre é 35");
		}

		else {
			System.out.printf("NOTA FINAL %.2f", stu.soma());
		}

		if (stu.soma() >= 60) {
			System.out.println("APROVADO");
		}

		else {
			System.out.printf("\nREPROVADO POR %.2f PONTOS", stu.faltouPontos());

		}

		sc.close();

	}

}
