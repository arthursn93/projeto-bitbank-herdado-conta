package br.com.bitbank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bitbank.banco.modelo.Conta;
import br.com.bitbank.banco.modelo.ContaCorrente;

public class TesteArrayLinkedList {

	public static void main(String[] args) {

		//Lista do tipo Conta ----------------------------
		
		//List<Conta> lista = new ArrayList<Conta>();
		//List<Conta> lista = new Vector<Conta>();
		List<Conta> lista = new LinkedList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(123,123333);
		lista.add(cc);

		ContaCorrente cc2 = new ContaCorrente(222,222222);
		lista.add(cc2);

		ContaCorrente cc3 = new ContaCorrente(444,2345673);
		lista.add(cc3);

		ContaCorrente cc4 = new ContaCorrente(675,334534);
		lista.add(cc4);

		System.out.println("Tamanho da Array: " + lista.size());

		//			Conta ref = (Conta)lista.get(0);
		/*
		 * Não precisamos mais fazer o cast, 
		 * pois já definimos o tipo da lista...
		 */

		Conta ref = lista.get(0);
		System.out.println(ref);

		lista.remove(0);

		System.out.println("Tamanho da Array, depois de remover um objeto da lista: " + lista.size());

		System.out.println(" ");
		System.out.println("-------------------- Utilizando FOR clássico");
		System.out.println(" ");

		for (int i = 0; i < lista.size(); i++) {
			Conta oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println(" ");
		System.out.println("-------------------- Utilizando FOR de outra forma");
		System.out.println(" ");

		for(Conta oRef : lista) {
			System.out.println(oRef);
		}

		/*
		 * Não é mais necessário definir a lista como Oject, 
		 * pois já definimos o tipo de lista como Conta
		 */

		//			System.out.println(" ");
		//			System.out.println("-------------------- Utilizando FOR clássico");
		//			System.out.println(" ");
		//
		//			for (int i = 0; i < lista.size(); i++) {
		//				Object oRef = lista.get(i);
		//				System.out.println(oRef);
		//			}
		//			
		//			System.out.println(" ");
		//			System.out.println("-------------------- Utilizando FOR de outra forma");
		//			System.out.println(" ");
		//
		//			for(Object oRef : lista) {
		//				System.out.println(oRef);
		//			}

	}

}


