package br.com.bitbank.banco.teste;

import br.com.bitbank.banco.modelo.*;

public class TesteArmazenamentoContas {

	public static void main(String[] args) {
		
		ArmazenamentoDeContas armazena = new ArmazenamentoDeContas();
		
		ContaCorrente cc = new ContaCorrente(123,123333);
		armazena.adiciona(cc);
		
		ContaCorrente cc2 = new ContaCorrente(222,222222);
		armazena.adiciona(cc2);
		
		int tamanho = armazena.getQuantidadeContas();
		System.out.println(tamanho);
		
		Conta ref = armazena.getReferencia(0);
		System.out.println(ref);
	}

}
