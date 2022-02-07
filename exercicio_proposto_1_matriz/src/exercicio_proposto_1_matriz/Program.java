package exercicio_proposto_1_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Linhas: ");
		int l = sc.nextInt();

		System.out.print("Colunas: ");
		int c = sc.nextInt();

		int matriz[][] = new int[l][c];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("M [" + i + "][" + j + "] = ");
				matriz[i][j] = sc.nextInt();
			}

		}

		System.out.println(" ");
		System.out.println("Matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.print("\nQual número será procurado? ");
		int numProcurado = sc.nextInt();

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (matriz[i][j] == numProcurado) {
					System.out.println("\nPosição: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Lado esquerdo: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Em cima: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Lado direito: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Embaixo: " + matriz[i + 1][j]);
					}
				}
			}

			sc.close();
		}

	}
}