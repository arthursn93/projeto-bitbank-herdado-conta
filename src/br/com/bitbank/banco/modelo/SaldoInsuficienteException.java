package br.com.bitbank.banco.modelo;

/**
 * Classe que representa uma exce��o do tipo SaldoInsuficienteException
 * @author arthurnunes
 *
 */
public class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
