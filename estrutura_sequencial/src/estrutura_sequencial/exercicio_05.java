package estrutura_sequencial;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, qtdePeca1, codPeca2, qtdePeca2;
		double valPeca1, valPeca2, total;
		
		System.out.print("C�digo pe�a 1: ");
		codPeca1 = sc.nextInt();
		
		System.out.print("Quantidade pe�a 1: ");
		qtdePeca1 = sc.nextInt();
		
		System.out.print("Valor pe�a 1: R$ ");
		valPeca1 = sc.nextDouble();
		
		System.out.print("C�digo pe�a 2: ");
		codPeca2 = sc.nextInt();
		
		System.out.print("Quantidade pe�a 2: ");
		qtdePeca2 = sc.nextInt();
		
		System.out.print("Valor pe�a 2: R$ ");
		valPeca2 = sc.nextDouble();
		
		total = (qtdePeca1 * valPeca1) + (qtdePeca2 * valPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		sc.close();
	}

}
