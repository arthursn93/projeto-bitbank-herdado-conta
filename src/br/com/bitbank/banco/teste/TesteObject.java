package br.com.bitbank.banco.teste;

import br.com.bitbank.banco.modelo.*;

public class TesteObject {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(2);
		System.out.println(false);
		
		Object cc = new ContaCorrente(123,123123);
		Object cp = new ContaPoupanca(231,231242);
		Object cl = new Cliente("Arthur","333.333.333-33","Engenheiro");
		
		System.out.println(cc);
		System.out.println(cp);
		
		println(cc);
		println(cl); 
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Object referencia) {
		
	}
}
