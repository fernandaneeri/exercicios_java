package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] vetor = new Rent[10];

		System.out.print("Quantos quartos serão alugados? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.printf("Aluguel #%d: \n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Rent(nome, email);
		}

		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] != null) {

				System.out.println(j + ": " + vetor[j]);
			}
		}

		sc.close();
	}

}
