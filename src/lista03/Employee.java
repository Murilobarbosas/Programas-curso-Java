package lista03;

public class Employee {
	public String name;
	public double GrossSalary, Tax;
	
	public Employee() {
		super();
	}

	public Employee(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		GrossSalary = grossSalary;
		Tax = tax;
	}

	public double netSalary() {
		return GrossSalary - Tax;
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary = GrossSalary + (GrossSalary * (percentage/100));
	}
	
	public String toString() {
		return name + ", $ " + netSalary();
	}
}
