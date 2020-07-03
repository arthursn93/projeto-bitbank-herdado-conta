package br.com.bitbank.banco.modelo;

/** Classe que representa o valor do imposto de Seguro de Vida, será retornado na interface Tributavel.
 * 
 * @author arthurnunes
 *
 */
public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
