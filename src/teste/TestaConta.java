package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente contaPedro = new ContaCorrente(1222,123333323);
		Cliente clienteP = new Cliente("Pedro","333.333.333-33", "Programador");
		
		contaPedro.setTitular(clienteP);
		
		System.out.println(clienteP.getNome());		
		System.out.println(contaPedro.getTitular().getNome());
		
		
		ContaPoupanca contaFarias = new ContaPoupanca(2322,23232332);
		
		Cliente clienteF = new Cliente("Farias", "555.555.555-55", "Designer");
		
		contaFarias.setTitular(clienteF);
		
		contaPedro.setSaldo(2000);
		contaFarias.setSaldo(1000);
		
		
		contaPedro.transfere(200, contaFarias);
		

		
		System.out.println("Saldo do Pedro - " + contaPedro.getSaldo());
		System.out.println("Saldo do Farias - " + contaFarias.getSaldo());
		
		
		
		System.out.println(Conta.getTotal());

	
		

	}

}
