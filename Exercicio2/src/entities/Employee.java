package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentage) {
		this.grossSalary += (grossSalary * porcentage) / 100;
		}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f\n", netSalary());
	}

}
