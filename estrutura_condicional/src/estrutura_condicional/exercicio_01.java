package estrutura_condicional;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Informe um número: ");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println("POSITIVO");
		}

		else {
			System.out.println("NEGATIVO");
		}

		sc.close();
	}

}
