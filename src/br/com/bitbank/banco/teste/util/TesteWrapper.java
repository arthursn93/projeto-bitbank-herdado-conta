package br.com.bitbank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {
		
		/**
		 * 	Autoboxing - transformação de primitivo (int) para objeto (Integer)
		 * 	Ex: int -> Autoboxing -> java.lang.Integer 
		 * 		int <-   Uboxing  -> java.lang.Integer
		 */
		int idade = 29;

		Integer idadeRef = Integer.valueOf(29); // vai criar um objeto (Integer) a partir do valor 29 -> Autoboxing	
		int valor = idadeRef.intValue(); // devolve o valor (int) como primitivo -> Unboxing
		
		System.out.println("Max: " + Integer.MAX_VALUE);
		System.out.println("Min: " + Integer.MIN_VALUE);
		System.out.println("Size: " + Integer.SIZE);
		System.out.println("Bytes: " + Integer.BYTES);
		
		List<Integer> numeros = new ArrayList<Integer>();
		//numeros.add(Integer.valueOf(29)); //Autoboxing (por debaixo dos panos)
		numeros.add(29); //Autoboxing
			
		
		/**
		 * Estamos utilizando o args[], então vai ser necessário:
		 * Run Configurations -> Arguments -> Digite nº aleatório para testar
		 */
		String s = args[0]; //"10"
		Integer numero = Integer.parseInt(s);
		System.out.println("Nº no args[]: "+ numero);
		
		/**
		 * Transformo a String num objeto do tipo Integer
		 */
		Integer ref = Integer.valueOf("3");
		ref++;
		System.out.println("Iterou para: " + ref);
		
		String diaComoTexto = "29";
		int dia = Integer.valueOf(diaComoTexto);
		System.out.println(dia);
		
	}
}
