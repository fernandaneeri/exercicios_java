package entities;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposito(double montante) {
		return saldo += montante;
	}

	public double saque(double montante) {
		return saldo -= montante + 5;
	}

	public String toString() {
		return "Conta " + numero + ", Titular: " + titular + ", Saldo: $ " + String.format("%.2f", saldo);
	}

}