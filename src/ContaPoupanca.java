
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);	
	}

	@Override
	public void depositar(double valor, Conta destino) {
		this.saldo += valor;
		return;
	}

}