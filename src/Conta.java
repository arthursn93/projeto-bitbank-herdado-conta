public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(null, null, null);
	private static int total;
	
	public Conta(int agencia, int numero) {	
		if(agencia  >= 0 || numero >= 0) {
			this.agencia = agencia;
			this.numero = numero;
			total++;
		}else {
			System.out.println("Não pode número negativo.");
		}			
	}
	
	public abstract void depositar(double valor, Conta destino);
	
	public boolean sacar(double valor, Conta destino) {
		if(this.saldo >= 0) {
			this.saldo -= valor;
			destino.depositar(valor, destino);	
			return true;
		}else {		
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.sacar(valor, destino)) {			
			return true;
		}else {
			System.out.println("Você não tem dinheiro para realizar transferência!");
			return false;
		}
	}
	
	public void setSaldo(double saldo) {
		if(this.saldo <= 0) {
			System.out.println("Saldo insuficiente ou inválido!");
		}else {
			this.saldo = saldo;
		}
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
