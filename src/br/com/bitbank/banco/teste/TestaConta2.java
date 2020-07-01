package br.com.bitbank.banco.teste;

import br.com.bitbank.banco.modelo.*;

public class TestaConta2 {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(-123, -123123123);
		ContaPoupanca cp = new ContaPoupanca(222, 2222222);
		
		System.out.println(cc.getAgencia());
		System.out.println(cc.getNumero());
		
		cc.setSaldo(2000);
		cp.setSaldo(1500);
		
		cc.depositar(200);
		
		cp.depositar(200);
		
		
		cc.transfere(100, cp);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		System.out.println("-----------------");

		cc.sacar(20);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
