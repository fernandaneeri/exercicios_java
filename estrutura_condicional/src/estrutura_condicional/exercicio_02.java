package estrutura_condicional;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Informe um n?mero: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("PAR");
		}

		else {
			System.out.println("?MPAR");
		}

		sc.close();
	}

}
