package br.com.bitbank.banco.modelo;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(null, null, null);
	private static int total;
	
	public Conta(int agencia, int numero) {	
		if(agencia  < 0 || numero < 0) {
			throw new ContaException("O número e agência da sua conta deve ser positivo.");
		}
		this.agencia = agencia;
		this.numero = numero;
		total++;		
	}
	
	public void sacar(double valor) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor );
		}
		else if(valor < 0) {
			throw new IllegalArgumentException("Apenas números positivos...");
		}
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Apenas números positivos...");
		}
		this.saldo += valor;
	}
	
	public void transfere(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public void setSaldo(double saldo) {
		if(saldo < 0) {
			throw new IllegalArgumentException("Apenas números positivos...");
		}
		this.saldo = saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return numero;
	}
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public static int getTotal() {
		return total;
	}
}
