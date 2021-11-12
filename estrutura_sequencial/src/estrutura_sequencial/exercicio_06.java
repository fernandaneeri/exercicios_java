package estrutura_sequencial;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A, B, C, trian, circ, trap, quad, retan;

		System.out.print("Valor A: ");
		A = sc.nextDouble();

		System.out.print("Valor B: ");
		B = sc.nextDouble();

		System.out.print("Valor C: ");
		C = sc.nextDouble();

		trian = (A * C) / 2;
		circ = 3.14159 * Math.pow(C, 2);
		trap = (A + B) * C / 2;
		quad = Math.pow(B, 2);
		retan = A * B;

		System.out.printf("TRIÂNGULO: %.3f%n", trian);
		System.out.printf("CÍRCULO: %.3f%n", circ);
		System.out.printf("TRAPÉZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETÂNGULO: %.3f%n", retan);
		
		sc.close();

	}

}
