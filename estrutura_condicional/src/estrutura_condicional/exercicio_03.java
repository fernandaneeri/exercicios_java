package estrutura_condicional;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.print("Informe um n�mero: ");
		a = sc.nextInt();

		System.out.print("Informe outro n�mero: ");
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}

		sc.close();
	}

}
