package br.com.bitbank.banco.modelo;

/**
 * Classe que representa uma exceção do tipo ContaException
 * @author arthurnunes
 *
 */
public class ContaException extends RuntimeException {
	public ContaException(String msg) {
		super(msg);
	}
}
