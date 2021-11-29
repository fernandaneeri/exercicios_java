package estrutura_while;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 0;

		System.out.print("Senha: ");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida");
			System.out.print("Digite a senha novamente: ");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido");
		sc.close();
	}

}
