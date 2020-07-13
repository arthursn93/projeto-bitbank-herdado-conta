package br.com.bitbank.banco.teste;

import br.com.bitbank.banco.modelo.*;

public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente contaPedro = new ContaCorrente(1222,123333323);
		
		Cliente clienteP = new Cliente("333.333.333-33");
		contaPedro.setTitular(clienteP);
		
		System.out.println(clienteP.getNome());		
		System.out.println(contaPedro.getTitular().getNome());
		
		ContaPoupanca contaFarias = new ContaPoupanca(2322,23232332);
		
		Cliente clienteF = new Cliente("555.555.555-55");
		contaFarias.setTitular(clienteF);
		
		contaPedro.setSaldo(2000);
		contaFarias.setSaldo(1000);
		
		contaPedro.transfere(200, contaFarias);
		
		System.out.println("Saldo do Pedro - " + contaPedro.getSaldo());
		System.out.println("Saldo do Farias - " + contaFarias.getSaldo());
		
		System.out.println(Conta.getTotal());

	}
}
