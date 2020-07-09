package br.com.bitbank.banco.teste;

import br.com.bitbank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		//Object é termo genérico pra qualquer tipo de classe, variável, etc...
		Object[] objeto = new Object[5];
		Cliente cliente = new Cliente("Jon", "333.333.333-33", "Programador");
		objeto[3] = cliente;
		System.out.println(objeto[3].toString());
		//Array armazena objetos
		ContaCorrente[] contas = new ContaCorrente[5];
		//Objeto criado
		ContaCorrente cc1 = new ContaCorrente(123,123123);
		//Array na casa zero recebe objeto
		contas[0] = cc1;
		//Definimos o saldo 
		contas[0].setSaldo(200);
		//Depositamos o valor do saldo
		contas[0].depositar(2000);
		//Exibimos a informação na tela dentro da Array zero
		System.out.println("Saldo a partir da array: " + contas[0].getSaldo());
		//Exibimos a informação na tela a partir da referência (objeto)
		System.out.println("Saldo a partir da referência: " + cc1.getSaldo());
		
		ContaCorrente cc2 = new ContaCorrente(234,23423);
		contas[1] = cc2;
		
		System.out.println("Numero de contas[1]: " + contas[1].getNumero());
		System.out.println("Numero de cc2: " + cc2.getNumero());
		
		ContaCorrente ref = contas[1];
		//ContaCorrente ref = (ContaCorrente) contas[1]; //type cast
		System.out.println("Numero de ref: " + ref.getNumero());
		
		System.out.println("------------ Clássico");
		int[] numeros = new int[6];
		numeros[0] = 23;
		numeros[1] = 24;
		numeros[2] = 56;
		numeros[3] = 36;
		numeros[4] = 87;
		numeros[5] = 12;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("------------ Literal");
		int[] refs = {12,32,45,32,34,56};
		for (int i = 0; i < refs.length; i++) {
			System.out.println(refs[i]);
		}
		
		Cliente clienteNormal = new Cliente("Osmar", "033.333.333-33", "Designer");		
		Cliente clienteVip = new Cliente("Pedro", "133.333.333-33", "Engenheiro");
		clienteVip.setNome("Marcelo");
		Object[] rf = new Object[5];
		rf[0] = clienteNormal;
		rf[1] = clienteVip;
		
		System.out.println(rf[1].toString());
		System.out.println(clienteVip.getNome());
		



		
	}

}
