package lista05;

public class ModelEP {
	int id;
	String name;
	double salario;
	
	public ModelEP(int id, String name, double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salario;
	}
	
	public void increaseSalary(double percentage) {
		salario += salario*percentage/100;
	}
	
}
