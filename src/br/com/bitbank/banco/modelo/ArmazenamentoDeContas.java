package br.com.bitbank.banco.modelo;

public class ArmazenamentoDeContas {
	private Conta[] armazenaContas;
	private int posLivre;
	
	public ArmazenamentoDeContas() {
		this.armazenaContas = new Conta[10];
		this.posLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.armazenaContas[this.posLivre] = ref;
		this.posLivre++;
	}
	
	public int getQuantidadeContas() {
		return this.posLivre;
	}

	public Conta getReferencia(int pos) {
		return this.armazenaContas[pos];
	}
	

}
