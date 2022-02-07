package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos empregados serão cadastrados? ");
		int num = sc.nextInt();

		List<Employee> lista = new ArrayList<>();
		Employee emp = new Employee();

		for (int i = 0; i < num; i++) {
			System.out.printf("Empregado #%d: \n", i + 1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			lista.add(new Employee(id, nome, salario));
			System.out.println(" ");
		}

		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();

		emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.print("Este ID não existe!");
		} else {
			System.out.print("Informe a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.aumentoSalario(porcentagem);
		}
		
		System.out.println(" ");
		System.out.println("Lista de Empregados: ");
		for (Employee employee : lista) {
			System.out.println(employee);
		}

		sc.close();

	}

}
