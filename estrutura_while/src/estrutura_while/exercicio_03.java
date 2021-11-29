package estrutura_while;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, combustivel;

		System.out.print("Qual tipo de combustível abastecido: 1 - Álcool, 2 - Gasolina, 3 - Diesel ou 4 - Fim? ");
		combustivel = sc.nextInt();

		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool += 1;
			}

			else if (combustivel == 2) {
				gasolina += 1;
			}

			else if (combustivel == 2) {
				diesel += 1;
			}

			System.out.print("Qual tipo de combustível abastecido: 1 - Álcool, 2 - Gasolina, 3 - Diesel ou 4 - Fim? ");
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
