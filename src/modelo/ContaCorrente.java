package modelo;

public class ContaCorrente extends Conta implements Tributavel {

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

}
