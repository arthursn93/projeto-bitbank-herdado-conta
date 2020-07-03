package br.com.bitbank.banco.modelo;

/**
 * Classe que representa o valor do imposto da Bolsa de A��o. Ser� retornado na interface Tributavel.
 * @author arthurnunes
 *
 */
public class AcaoBolsa implements Tributavel {

	@Override
	public double getValorImposto() {
		return 45;
	}
}
