package appliaction;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		System.out.print("Porcentage: ");
		porcentage = sc.nextDouble();
		employee.increaseSalary(porcentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
		
		
		
		
		
		

	}

}
