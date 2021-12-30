package program;

import java.util.Locale;
import java.util.Scanner;

import employee.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Name: ");
		emp.name = sc.next();

		System.out.print("Gross salary: ");
		emp.salary = sc.nextDouble();

		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();

		System.out.println(emp.toString());
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage); 
		
		
		System.out.println(emp.toString());
		

		sc.close();
	}

}
