package estrutura_sequencial;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		double horas, valHora, salario;
		
		System.out.print("Número de matrícula do funcionário: ");
		num = sc.nextInt();
		
		System.out.print("Total de horas trabalhadas: ");
		horas = sc.nextDouble();
		
		System.out.print("Valor por hora: R$ ");
		valHora = sc.nextDouble();
		
		salario = horas * valHora;
		
		System.out.printf("NÚMERO = %d%nSALÁRIO = R$ %.2f", num, salario);

		sc.close();
	}

}
