package br.com.bitbank.banco.modelo;

/**
 * Classe que representa uma conta poupan�a bitbank.
 * @author arthurnunes
 *
 */
public class ContaPoupanca extends Conta {
	
	/**
	 * Construtor para inicializar o objeto Conta Poupan�a a partir do n�mero e ag�ncia.
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

}
