package br.com.bitbank.banco.modelo;

public class ArmazenamentoDeReferencias {
	
	private Object[] referencias;
	private int posLivre;
	
	public ArmazenamentoDeReferencias() {
		this.referencias = new Object[10];
		this.posLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posLivre] = ref;
		this.posLivre++;
	}
	
	public int getQuantidadeElementos() {
		return this.posLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}

