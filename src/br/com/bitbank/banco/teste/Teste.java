package br.com.bitbank.banco.teste;

public class Teste {

	public static void main(String[] args) {
		
		// Array
		int[] idade = new int[5]; 
		idade[0] = 23;
		idade[1] = 24;
		idade[2] = 67;
		idade[3] = 89;
		idade[4] = 21;
		
		//System.out.println(idade[0]); //Array printado na tela
		
		//System.out.println(idade.length);// exibe o tamanho da Array na tela
		System.out.println("-------------------------- exibindo array");

		for (int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]); // exibe todos os valores dentro da Array
		}
		
		System.out.println("-------------------------- multiplicando");
		
		for (int i = 0; i < idade.length; i++) {
			idade[i] *= i; // multiplicamos o valor por ela mesmo
			System.out.println(idade[i]); // exibe todos os valores dentro da Array
		}		
	}

}
