package estrutura_condicional;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.print("Informe um número: ");
		a = sc.nextInt();

		System.out.print("Informe outro número: ");
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

		sc.close();
	}

}
