package br.com.bitbank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bitbank.banco.modelo.Cliente;
import br.com.bitbank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente("33.333.333-33");
		cliente.setNome("Arthur");
		cliente.setProfissao("Programador Jr.");
		
		ContaCorrente cc = new ContaCorrente(222,22344);
		cc.setTitular(cliente);
		cc.depositar(657.2);
		
//		transforma um objeto em fluxo binário (saída) (serialização)
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
