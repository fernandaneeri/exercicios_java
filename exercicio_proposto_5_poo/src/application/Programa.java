package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Nome do titular: ");
		String titular = sc.next();
		System.out.print("Haverá um depósito inicial (S/N)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 'S') {
			System.out.print("Informe o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}

		else {
			conta = new Conta(numero, titular);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.print("\nInforme o valor do depósito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);

		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);

		System.out.print("\nInforme o valor do saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);

		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);

		sc.close();
	}

}
