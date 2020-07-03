package br.com.bitbank.banco.modelo;
/**
 * Classe que representa um Calculador de Imposto
 * @author arthurnunes
 *
 */
public class CalculadorImposto {
	
	private double totalImposto;
	
	/**
	 * Método para registrar um valor que passa pela interface Tributavel.
	 * @param t
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
