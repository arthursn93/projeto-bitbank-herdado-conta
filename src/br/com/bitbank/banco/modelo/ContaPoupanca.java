package br.com.bitbank.banco.modelo;

/**
 * Classe que representa uma conta poupança bitbank.
 * @author arthurnunes
 *
 */
public class ContaPoupanca extends Conta {
	
	/**
	 * Construtor para inicializar o objeto Conta Poupança a partir do número e agência.
	 * @param agencia
	 * @param numero
	 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);	
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		return;
	}
	
	@Override
	public String toString() {
		return "ContaPoupança , " + super.toString();
	}

}
