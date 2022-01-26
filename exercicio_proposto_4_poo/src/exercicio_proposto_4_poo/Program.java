package exercicio_proposto_4_poo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do dólar? ");
		double dolar = sc.nextDouble();

		System.out.print("Quantos dólares você quer comprar? ");
		double montante = sc.nextDouble();

		double resultado = CurrencyConverter.conversao(dolar, montante);
		System.out.printf("Resultado: %.2f ", resultado);

		sc.close();
	}

}
