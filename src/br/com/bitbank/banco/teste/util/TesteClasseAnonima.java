package br.com.bitbank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bitbank.banco.modelo.*;

public class TesteClasseAnonima {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente("333.333.333-33");
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente("444.444.444-44");
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente("555.555.555-55");
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente("777.777.777-77");
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.depositar(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		lista.sort(new Comparator<Conta>() { // classe an�nima sendo instanciada
			@Override
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		}
	);
		
		Comparator<Conta> comp = new Comparator<Conta>() {

			@Override
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		};
		
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}
}

