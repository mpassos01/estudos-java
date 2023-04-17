package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double porcentagem;
	
	public double netSalary() {
		return grossSalary - tax;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());		
	}
	
	public void increaseSalary(double porcentagem) {
		grossSalary = grossSalary + 0.01 * porcentagem * grossSalary;
	}
	
	public String novoNome() {
		return name + ", $ " + String.format("%.2f", grossSalary);
	}
	
}
