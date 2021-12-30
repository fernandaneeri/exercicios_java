package employee;

public class Employee {

	public String name;
	public double salary, tax;

	public double netSalary() {
		return salary - tax;
	}

	public void increaseSalary(double por) {
		salary += salary * (por / 100);

	}

	public String toString() {
		return "\nEmployee: " + name + ", $ " + String.format("%.2f", netSalary());

	}

}
