package br.com.bitbank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(3.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.TRUE; // autoboxing
		System.out.println(bRef.booleanValue()); // unboxing
		
		Number refNumero = Double.valueOf(29.9); // autoboxing
		System.out.println(refNumero); // unboxing
		
		// Number é "pai" de todos os tipos primitivos (double, int, long, etc..)
		List<Number> lista = new ArrayList<>();
		lista.add(10); // int
		lista.add(43.4); // double
		lista.add(34.3f); // float
	}
}
