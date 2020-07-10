package br.com.bitbank.banco.teste;

import br.com.bitbank.banco.modelo.*;


public class TesteArmazenamentoReferencias {

	public static void main(String[] args) {
		
		ArmazenamentoDeReferencias armazena = new ArmazenamentoDeReferencias();
		
		ContaCorrente cc = new ContaCorrente(123,123333);
		armazena.adiciona(cc);
		
		ContaCorrente cc2 = new ContaCorrente(222,222222);
		armazena.adiciona(cc2);
		
		int tamanho = armazena.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta)armazena.getReferencia(1);
		System.out.println(ref);

	}

}
