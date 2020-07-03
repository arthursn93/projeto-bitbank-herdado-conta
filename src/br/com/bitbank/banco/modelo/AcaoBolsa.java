package br.com.bitbank.banco.modelo;

/**
 * Classe que representa o valor do imposto da Bolsa de Ação. Será retornado na interface Tributavel.
 * @author arthurnunes
 *
 */
public class AcaoBolsa implements Tributavel {

	@Override
	public double getValorImposto() {
		return 45;
	}
}
