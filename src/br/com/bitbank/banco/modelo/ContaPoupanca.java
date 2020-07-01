package br.com.bitbank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);	
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		return;
	}

}
