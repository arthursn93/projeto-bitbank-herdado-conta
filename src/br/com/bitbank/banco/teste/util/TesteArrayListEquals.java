package br.com.bitbank.banco.teste.util;

import java.util.ArrayList;

import br.com.bitbank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22,22);
//		Conta cc2 = new ContaCorrente(22,22);
//		
//		boolean igual = cc1.equals(cc2);
//		
//		System.out.println(igual);

		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(123,123333);
		lista.add(cc);
		
		ContaCorrente cc2 = new ContaCorrente(222,222222);
		lista.add(cc2);
		
		ContaCorrente cc3 = new ContaCorrente(222,222222);
		boolean exists = lista.contains(cc3);
		
		System.out.println("Já existe? " + exists);
		
		System.out.println(" ");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
