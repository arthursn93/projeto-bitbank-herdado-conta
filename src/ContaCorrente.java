
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}
	
	@Override
	public boolean sacar(double valor, Conta destino) {
		return super.sacar(valor, destino);
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		return super.transfere(valor, destino);
	}

	@Override
	public void depositar(double valor, Conta destino) {
		this.saldo += valor;
		return;

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
