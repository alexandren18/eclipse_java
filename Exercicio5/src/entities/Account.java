package entities;

public class Account {
	private String name;
	private int numeroConta;
	private double saldo;
	
	
	public Account(String name, int numeroConta, double initialDeposit) {
		super();
		this.name = name;
		this.numeroConta = numeroConta;
		deposito(initialDeposit);
	}


	public Account(String name, int numeroConta) {
		super();
		this.name = name;
		this.numeroConta = numeroConta;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public double deposito(double deposito) {
		return this.saldo += deposito;
	}
	
	public double saque(double saque) {
		return this.saldo -= (5 + saque);
	}
	
	public String toString() {
		return "Account " + numeroConta + ", " + "Holder: " + name + ", " + String.format("Balance: $ %.2f\n ",saldo);
	}
	
	
	
	
	
	
	
}
