package br.com.bitbank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * @author arthurnunes
 *
 */
public abstract class Conta implements Comparable<Conta>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6866765121975315623L;
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular = new Cliente(null);
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir do n�mero e ag�ncia.
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {	
		if(agencia  < 0 || numero < 0) {
			throw new ContaException("O n�mero e ag�ncia da sua conta deve ser positivo.");
		}
		this.agencia = agencia;
		this.numero = numero;
		total++;		
	}
	/**
	 * M�todo para sacar. Se o saldo for menor que o valor ou menor que 0, � jogada uma Exce��o.
	 * @param valor
	 */
	public void sacar(double valor) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor );
		}
		else if(valor < 0) {
			throw new IllegalArgumentException("Apenas n�meros positivos...");
		}
		this.saldo -= valor;
	}
	/** M�todo para depositar um valor. Se o valor for menor que 0, � jogada uma Exce��o.
	 * 
	 * @param valor
	 */	
	public void depositar(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Apenas n�meros positivos...");
		}
		this.saldo += valor;
	}
	/**
	 * M�todo para transferir um valor em uma Conta destino.
	 * @param valor
	 * @param destino
	 */
	public void transfere(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public void setSaldo(double saldo) {
		if(saldo < 0) {
			throw new IllegalArgumentException("Apenas n�meros positivos...");
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
	
	@Override
	public boolean equals(Object ref) {
		// pegamos uma refer�ncia gen�rica de um objeto
		// e transformamos ele num tipo Conta
		Conta outraConta = (Conta)ref;
		
		if(this.agencia != outraConta.agencia) {
			return false;
		}
		if(this.numero != outraConta.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "N�: " + this.numero + " Ag: " + this.agencia + " Saldo: " + this.saldo;
	}
}
