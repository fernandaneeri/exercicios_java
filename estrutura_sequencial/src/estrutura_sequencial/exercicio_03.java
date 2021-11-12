package estrutura_sequencial;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, dif;

		System.out.print("Digite um valor para A: ");
		a = sc.nextInt();

		System.out.print("Digite um valor para B: ");
		b = sc.nextInt();

		System.out.print("Digite um valor para C: ");
		c = sc.nextInt();

		System.out.print("Digite um valor para D: ");
		d = sc.nextInt();

		dif = (a * b - c * d);

		System.out.println("DIFERENÇA = " + dif);

		sc.close();
	}

}
