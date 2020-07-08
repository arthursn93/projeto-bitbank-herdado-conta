package br.com.bitbank.banco.modelo;
/**
 * Classe que representa uma conta corrente bitbank
 * @author arthurnunes
 *
 */
public class ContaCorrente extends Conta implements Tributavel {
	
	/**
	 * Construtor para inicializar o objeto Conta Corrente a partir do número e agência.
	 * @param agencia
	 * @param numero
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
	}

	@Override
	public void transfere(double valor, Conta destino) {
		super.transfere(valor, destino);
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
}
