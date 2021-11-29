package estrutura_while;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.print("X: ");
		x = sc.nextInt();

		System.out.print("Y: ");
		y = sc.nextInt();

		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante\n");
			}

			else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante\n");
			}

			else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante\n");
			}

			else if (x > 02 && y < 0) {
				System.out.println("Quarto quadrante\n");
			}

			System.out.print("X: ");
			x = sc.nextInt();

			System.out.print("Y: ");
			y = sc.nextInt();
		}

		sc.close();

	}

}
