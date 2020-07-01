package br.com.bitbank.banco.teste;

import br.com.bitbank.banco.modelo.*;

public class TestaConta3 {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 123123);
		ContaCorrente cd = new ContaCorrente(231,232323);
		
		
		cc.depositar(2000);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());		
		
		
		//cd.setSaldo(200);
		cd.depositar(-200);
		cd.transfere(200, cc);
				
		System.out.println(cd.getSaldo());

	}

}
